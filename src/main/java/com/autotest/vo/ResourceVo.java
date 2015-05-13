package com.autotest.vo;

import java.util.List;



/**
 * @author HeP 资源发现信息VO
 * @version 1.0
 * 
 */
public class ResourceVo {
	
	private String resName;
	//发现资源名称
	private String resourceType;
	
	// 资源类别
	private String resourceModel;
	// 资源具体模型
	private List <RefPageVo> refPageVoList;
	// 所有步骤映射页面操作vo集合 


	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResourceType() {
		return resourceType;
	}

	public List<RefPageVo> getRefPageVoList() {
		return refPageVoList;
	}

	public void setRefPageVoList(List<RefPageVo> refPageVoList) {
		this.refPageVoList = refPageVoList;
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


}
