package com.jiudianlianxian.result;

import java.util.ArrayList;
import java.util.List;

import com.jiudianlianxian.base.BaseResult;
import com.jiudianlianxian.domain.Seed;


/**
 * 
 * @Title: GainCommodityServletResult
 * @Description: 获取所有种子信息返回实体
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017年9月26日 下午3:19:14
 *
 */
public class GainCommodityServletResult extends BaseResult {
	
	private List<Seed> seeds = new ArrayList<Seed>();

	public List<Seed> getSeeds() {
		return seeds;
	}

	public void setSeeds(List<Seed> seeds) {
		this.seeds = seeds;
	}
	
	

}
