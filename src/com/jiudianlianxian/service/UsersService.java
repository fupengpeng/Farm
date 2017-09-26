package com.jiudianlianxian.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jiudianlianxian.domain.Seed;
import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.result.GainCommodityServletResult;
import com.jiudianlianxian.utils.HibernateUtils;



/**
 * 
 * @Title: UsersService
 * @Description: 给此类一个描述
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017年9月26日 下午3:09:00
 *
 */
public class UsersService {
	private static final int SUCCESS = 0;
	private static final int ERROR = 1;
	
	
	/**
	 * 
	 * @Description: 查询所有种子信息并返回
	 * @param order_oid
	 * @return
	 */
	public GainCommodityServletResult getSeed(){
		GainCommodityServletResult gainCommodityServletResult = new GainCommodityServletResult();
		List<Seed> seeds = new ArrayList<Seed>();
		
		
		Session session = null;
		Transaction transaction = null;
//		try {
//			session = HibernateUtils.getSessionObject();
//			transaction = session.beginTransaction();
//			
//			Query query = session.createQuery("from User where user_uid=");
//			List<User> list = query.list();
//			for (User user : list) {
//				System.out.println("---------" + oldPassword);
//				if(oldPassword == null || oldPassword.isEmpty()){
//					updatePasswordResult.setCode(ERROR);
//					updatePasswordResult.setInfo("原密码为空，请重新输入！");
//					return updatePasswordResult;
//				}
//				if(newPassword == null || newPassword.isEmpty()){
//					updatePasswordResult.setCode(ERROR);
//					updatePasswordResult.setInfo("请输入新密码！");
//					return updatePasswordResult;
//				}
//				if (!(oldPassword.equals(user.getUser_password()))) {
//					System.out.println("----oldPassword-----" + user.getUser_password());
//					updatePasswordResult.setCode(ERROR);
//					updatePasswordResult.setInfo("原密码不正确，请重新输入！");
//					return updatePasswordResult;
//				}
//				
//			}
//			
//			System.out.println(hql);
//			query = session.createQuery(hql);
//			int result = query.executeUpdate();
//			
//			System.out.println("result = " + result);
//			if (result == 1) {
//				
//				updatePasswordResult.setCode(SUCCESS);
//				updatePasswordResult.setInfo("修改成功");
//				
//			} else {
//				updatePasswordResult.setCode(ERROR);
//				updatePasswordResult.setInfo("修改失败");
//			}
//			transaction.commit();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			transaction.rollback();
//		}
		
		
		return gainCommodityServletResult;
	}


}
