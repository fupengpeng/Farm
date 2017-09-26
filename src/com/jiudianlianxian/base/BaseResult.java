package com.jiudianlianxian.base;


/**
 * 
 * @Title: BaseResult
 * @Description: ����ʵ�����
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017��9��26�� ����3:15:33
 *
 */
public class BaseResult {
	
	private int code;
	private String info;
	
	public BaseResult(){}
	
	public BaseResult(int code, String info) {
		super();
		this.code = code;
		this.info = info;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}
