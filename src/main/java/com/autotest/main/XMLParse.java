package com.autotest.main;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;

import com.autotest.util.PropertiesUtil;
import com.autotest.vo.ResourceVo;


/**
 * 
 * 解析XML数据文件类
 * 
 * @author peng
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
	 * 获取根节点element
	 * @return Element
	 * @throws DocumentException
	 */
	private Element getRootElement() throws DocumentException {
		return XMLReader.getInstance(getXMLPath()).getDocument().getRootElement();
	}

	public List<ResourceVo> parseVO() throws DocumentException{
		 Element rootElement = getRootElement();
		 List <ResourceVo> list = new ArrayList<ResourceVo>();
		 rootElement.elementIterator();
		 
		 return list;
	}
	
	
	
//	public static void main(String[] args) throws DocumentException {
//		System.out.println();
//		System.out.println(new XMLParse().getRootElement());
//	}
}
