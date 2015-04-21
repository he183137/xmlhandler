package com.autotest.vo;

/**
 * @author HeP 映射页面信息vo
 * @version 1.0
 */
public class RefPageVo {
	private String refDataID;
	//映射到数据文件的id
	private String PageElementType;
	//页面元素查找类型
	private String PageElementVar;
	//页面元素具体值
	private PageHandlerVo pageHandlerVo;
	//页面元素操作信息Vo
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
