package com.jiudianlianxian.base;


/**
 * 
 * @Title: BaseResult
 * @Description: 返回实体基类
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017年9月26日 下午3:15:33
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
