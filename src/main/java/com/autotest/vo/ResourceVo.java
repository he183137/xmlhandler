package com.autotest.vo;

/**
 * @author HeP ��Դ������ϢVO
 * @version 1.0
 * 
 */
public class ResourceVo {
	private String resourceType;
	// ��Դ���
	private String resourceModel;
	// ��Դ����ģ��
	private RefPageVo refPageVo;

	// ӳ��ҳ�����vo

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
