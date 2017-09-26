package com.jiudianlianxian.bean;


/**
 * 
 * @Title: LoginRequestBean
 * @Description: ��¼����ʵ��
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017��9��26�� ����5:27:20
 *
 */
public class LoginRequestBean {
	private String tag;
	private String username ;
	private String password ;
	public LoginRequestBean(){}
	
	public LoginRequestBean(String tag, String username, String password) {
		super();
		this.tag = tag;
		this.username = username;
		this.password = password;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
