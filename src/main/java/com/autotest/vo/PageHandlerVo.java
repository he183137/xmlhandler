package com.autotest.vo;

/**
 * @author HeP ҳ������������vo
 * @version 1.0
 */
public class PageHandlerVo {
	private String methodName;
	// ����Ԫ�صķ�������
	private boolean isContact;
	// �Ƿ���������������
	private CheckPointVo checkPointVo;
	// ������ϢVo
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public boolean isContact() {
		return isContact;
	}

	public void setContact(boolean isContact) {
		this.isContact = isContact;
	}

	public CheckPointVo getCheckPointVo() {
		return checkPointVo;
	}

	public void setCheckPointVo(CheckPointVo checkPointVo) {
		this.checkPointVo = checkPointVo;
	}

}
