package com.autotest.vo;

/**
 * @author HeP ӳ��ҳ����Ϣvo
 * @version 1.0
 */
public class RefPageVo {
	private String refDataID;
	//ӳ�䵽�����ļ���id
	private String PageElementType;
	//ҳ��Ԫ�ز�������
	private String PageElementVar;
	//ҳ��Ԫ�ؾ���ֵ
	private PageHandlerVo pageHandlerVo;
	//ҳ��Ԫ�ز�����ϢVo
	public String getRefDataID() {
		return refDataID;
	}

	public void setRefDataID(String refDataID) {
		this.refDataID = refDataID;
	}

	public String getPageElementType() {
		return PageElementType;
	}

	public void setPageElementType(String pageElementType) {
		PageElementType = pageElementType;
	}

	public String getPageElementVar() {
		return PageElementVar;
	}

	public void setPageElementVar(String pageElementVar) {
		PageElementVar = pageElementVar;
	}

	public PageHandlerVo getPageHandlerVo() {
		return pageHandlerVo;
	}

	public void setPageHandlerVo(PageHandlerVo pageHandlerVo) {
		this.pageHandlerVo = pageHandlerVo;
	}
}
