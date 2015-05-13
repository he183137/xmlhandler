package com.autotest.main;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.autotest.util.PropertiesUtil;
import com.autotest.vo.*;


/**
 * 
 * ����XML�����ļ���
 * 
 * @author Hepeng
 * @version 1.0
 */
public class XMLParse {
	private String path;
	private static Logger log = Logger.getLogger(XMLParse.class);
	

	private String getXMLPath(){
		String FilePath = null;
		try {
			FilePath = PropertiesUtil.getInstance().getProperty("XML.File.Path");
			//setPath(FilePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("XML loading error",e);
		}
		return FilePath;
	}

	/**
	 * ��ȡ���ڵ�element
	 * @return Element
	 * @throws DocumentException
	 */
	private Element getRootElement() throws DocumentException {
		return XMLReader.getInstance(getXMLPath()).getDocument().getRootElement();
	}
	
	/**
	 * ����xml����װVO
	 * @return ResourceVo ��Դҳ�����VO
	 * @throws DocumentException
	 */
	public List<ResourceVo> parseVO() throws DocumentException{
		 Element rootElement = getRootElement();
		 List <ResourceVo> list = new ArrayList<ResourceVo>();
		 Iterator<Element> iterator = rootElement.elementIterator();
		 while (iterator.hasNext()) {
			ResourceVo rVo = new ResourceVo();
			Element resElement = iterator.next();
			
			String resName = resElement.attributeValue("resName");
			//��Դ����
			String resType = resElement.elementTextTrim("resourceType");
			//��Դ����
			String resModel = resElement.elementTextTrim("resourceModel");
			//��Դ����ģ��
			rVo.setResName(resName);
			rVo.setResourceModel(resModel);
			rVo.setResourceType(resType);
			List<RefPageVo> refPageVos = encapsulateRefPageVoList(resElement.element("resourceRefPage"));
			rVo.setRefPageVoList(refPageVos);
			list.add(rVo);
		}
		
		 return list;
	}
	
	/**
	 * ��װҳ��ӳ��VO����
	 * @param element
	 * @return ҳ��ӳ��VOs list
	 */
	private List<RefPageVo> encapsulateRefPageVoList(Element element){
		List<RefPageVo> list =null;
		log.debug("RefPageVo's element name :"+element.getName());
		if(element!=null && element.getName().equals("resourceRefPage")){
			list = new ArrayList<RefPageVo>();
			Iterator<Element> iterator = element.elementIterator();
			while(iterator.hasNext()){
				RefPageVo refPageVo = new RefPageVo();
				Element refPageElemnent = iterator.next();
				String dataID = refPageElemnent.attributeValue("refDataID");
				//�����ļ���ӦID
				String pageElementType = refPageElemnent.elementTextTrim("PageElementType");
				//ҳ��Ԫ������
				String PageElVar = refPageElemnent.elementTextTrim("PageElementVar");
				//ҳ��Ԫ��ֵ
				Element pageHandlerElement = refPageElemnent.element("PageHandlerMethod");
				//��ȡpagehandler�ڵ�Ԫ��
				refPageVo.setRefDataID(dataID);
				refPageVo.setPageElementType(pageElementType);
				refPageVo.setPageElementVar(PageElVar);
				refPageVo.setPageHandlerVo(encapsulatePageHandlerVo(pageHandlerElement));
				list.add(refPageVo);
			}	
		}
		return list; 
	}
	
	/**
	 * ��װҳ�����Vo
	 * @param element
	 * @return ҳ�����VO
	 */
	private PageHandlerVo encapsulatePageHandlerVo(Element element){
		PageHandlerVo pageHandlerVo = null;
		log.debug("PageHandlerVo's element name :"+element.getName());
		if(element!=null && element.getName().equals("PageHandlerMethod")){
			pageHandlerVo = new PageHandlerVo();
			String methodName = element.attributeValue("method");
			boolean isContact = Boolean.valueOf(element.attributeValue("isContact"));
			Element checkpointElement = element.element("checkPoint");
			pageHandlerVo.setMethodName(methodName);
			pageHandlerVo.setContact(isContact);
			pageHandlerVo.setCheckPointVo(encapsulateCheckPointVo(checkpointElement));
		}
		return pageHandlerVo;
	}
	
	
	private CheckPointVo encapsulateCheckPointVo(Element element){
		CheckPointVo checkPointVo = null;
		log.debug("CheckPointVo��s element name :"+element.getName());
		if(element!=null && element.getName().equals("checkPoint")){
			checkPointVo = new CheckPointVo();
			String cpElementType = element.attributeValue("elementType");
			String cpElementVar = element.attributeValue("elementVar");
			checkPointVo.setCheckElementVar(cpElementVar);
			checkPointVo.setCheckElemmentType(cpElementType);
		}
		return checkPointVo;
	}
	
//	public static void main(String[] args) throws DocumentException {
//
//		System.out.println(new XMLParse().parseVO());
//	}
}
