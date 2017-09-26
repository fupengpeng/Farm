package com.jiudianlianxian.result;

import java.util.ArrayList;
import java.util.List;

import com.jiudianlianxian.base.BaseResult;
import com.jiudianlianxian.domain.Seed;


/**
 * 
 * @Title: GainCommodityServletResult
 * @Description: ��ȡ����������Ϣ����ʵ��
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017��9��26�� ����3:19:14
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
