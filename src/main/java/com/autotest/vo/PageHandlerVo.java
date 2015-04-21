package com.autotest.vo;

/**
 * @author HeP 页面具体操作步骤vo
 * @version 1.0
 */
public class PageHandlerVo {
	private String methodNameString;
	// 操作元素的方法名称
	private boolean isContact;
	// 是否联动，启动检查点
	private CheckPointVo checkPointVo;
	// 检查点信息Vo
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
