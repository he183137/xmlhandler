package com.autotest.vo;

/**
 * @author HeP ҳ������������vo
 * @version 1.0
 */
public class PageHandlerVo {
	private String methodNameString;
	// ����Ԫ�صķ�������
	private boolean isContact;
	// �Ƿ���������������
	private CheckPointVo checkPointVo;
	// ������ϢVo
	public String getMethodNameString() {
		return methodNameString;
	}

	public void setMethodNameString(String methodNameString) {
		this.methodNameString = methodNameString;
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
