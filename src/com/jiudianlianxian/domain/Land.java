package com.jiudianlianxian.domain;


/**
 * 
 * @Title: Land
 * @Description: 给此类一个描述
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017年9月26日 上午10:36:51
 *
 */
public class Land {
	
	private Long landId;
	private String landName; 
	/**
	 * 土地状态
	 *     1：土地种植，landSeed有值，为种植的种子对象
	 *     2：未种植，已开垦
	 *     3：未开垦
	 */
	private String landState;
	private Seed landSeed;
	private User landUser;
	public Long getLandId() {
		return landId;
	}
	public void setLandId(Long landId) {
		this.landId = landId;
	}
	public String getLandName() {
		return landName;
	}
	public void setLandName(String landName) {
		this.landName = landName;
	}
	public String getLandState() {
		return landState;
	}
	public void setLandState(String landState) {
		this.landState = landState;
	}
	public Seed getLandSeed() {
		return landSeed;
	}
	public void setLandSeed(Seed landSeed) {
		this.landSeed = landSeed;
	}
	public User getLandUser() {
		return landUser;
	}
	public void setLandUser(User landUser) {
		this.landUser = landUser;
	}

	

	
	

}
