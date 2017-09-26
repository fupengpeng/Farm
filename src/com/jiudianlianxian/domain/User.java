package com.jiudianlianxian.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 
 * @Title: User
 * @Description: �û�ʵ��
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017��9��26�� ����10:10:51
 *
 */
public class User {
	
	private Long userId;
	private String userNickName;
	private String userImage;
	
	private Long userGold;
	
	private Set<Seed> userSeeds = new HashSet<Seed>();
	private Set<Land> userLands = new HashSet<Land>();
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public Long getUserGold() {
		return userGold;
	}
	public void setUserGold(Long userGold) {
		this.userGold = userGold;
	}
	public Set<Seed> getUserSeeds() {
		return userSeeds;
	}
	public void setUserSeeds(Set<Seed> userSeeds) {
		this.userSeeds = userSeeds;
	}
	public Set<Land> getUserLands() {
		return userLands;
	}
	public void setUserLands(Set<Land> userLands) {
		this.userLands = userLands;
	}
	
	

}
