package com.autotest.vo;

import java.util.List;



/**
 * @author HeP ��Դ������ϢVO
 * @version 1.0
 * 
 */
public class ResourceVo {
	
	private String resName;
	//������Դ����
	private String resourceType;
	
	// ��Դ���
	private String resourceModel;
	// ��Դ����ģ��
	private List <RefPageVo> refPageVoList;
	// ���в���ӳ��ҳ�����vo���� 


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
