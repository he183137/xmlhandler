package com.autotest.vo;

/**
 * @author HeP 资源发现信息VO
 * @version 1.0
 * 
 */
public class ResourceVo {
	private String resourceType;
	// 资源类别
	private String resourceModel;
	// 资源具体模型
	private RefPageVo refPageVo;

	// 映射页面操作vo

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceModel() {
		return resourceModel;
	}

	public void setResourceModel(String resourceModel) {
		this.resourceModel = resourceModel;
	}

	public RefPageVo getRefPageVo() {
		return refPageVo;
	}

	public void setRefPageVo(RefPageVo refPageVo) {
		this.refPageVo = refPageVo;
	}
}
