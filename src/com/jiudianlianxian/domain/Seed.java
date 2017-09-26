package com.jiudianlianxian.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 
 * @Title: Seed
 * @Description: 种子商品的实体
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017年9月26日 上午10:15:44
 *
 */
public class Seed {
	
	private Long seedId;
	private String seedName;
	private Long seedGrowthTime;
	private Double seedSellingPrice;
	private String seedImage;
	/**
	 * 种子数量，如果在商店，则为0
	 */
	private int seedNumber;
	/**
	 * 种子状态
	 *     1：商店
	 *     2：用户背包
	 *     3：种植在土地
	 */
	private String seedState;
	private User seedUser;
	private Land seedLand;
	public Long getSeedId() {
		return seedId;
	}
	public void setSeedId(Long seedId) {
		this.seedId = seedId;
	}
	public String getSeedName() {
		return seedName;
	}
	public void setSeedName(String seedName) {
		this.seedName = seedName;
	}
	public Long getSeedGrowthTime() {
		return seedGrowthTime;
	}
	public void setSeedGrowthTime(Long seedGrowthTime) {
		this.seedGrowthTime = seedGrowthTime;
	}
	public Double getSeedSellingPrice() {
		return seedSellingPrice;
	}
	public void setSeedSellingPrice(Double seedSellingPrice) {
		this.seedSellingPrice = seedSellingPrice;
	}
	public String getSeedImage() {
		return seedImage;
	}
	public void setSeedImage(String seedImage) {
		this.seedImage = seedImage;
	}
	public int getSeedNumber() {
		return seedNumber;
	}
	public void setSeedNumber(int seedNumber) {
		this.seedNumber = seedNumber;
	}
	public String getSeedState() {
		return seedState;
	}
	public void setSeedState(String seedState) {
		this.seedState = seedState;
	}
	public User getSeedUser() {
		return seedUser;
	}
	public void setSeedUser(User seedUser) {
		this.seedUser = seedUser;
	}
	public Land getSeedLand() {
		return seedLand;
	}
	public void setSeedLand(Land seedLand) {
		this.seedLand = seedLand;
	}


	
	

}
