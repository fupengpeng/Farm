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
 * @Description: ������һ������
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017��9��26�� ����3:09:00
 *
 */
public class UsersService {
	private static final int SUCCESS = 0;
	private static final int ERROR = 1;
	
	
	/**
	 * 
	 * @Description: ��ѯ����������Ϣ������
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
//					updatePasswordResult.setInfo("ԭ����Ϊ�գ����������룡");
//					return updatePasswordResult;
//				}
//				if(newPassword == null || newPassword.isEmpty()){
//					updatePasswordResult.setCode(ERROR);
//					updatePasswordResult.setInfo("�����������룡");
//					return updatePasswordResult;
//				}
//				if (!(oldPassword.equals(user.getUser_password()))) {
//					System.out.println("----oldPassword-----" + user.getUser_password());
//					updatePasswordResult.setCode(ERROR);
//					updatePasswordResult.setInfo("ԭ���벻��ȷ�����������룡");
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
//				updatePasswordResult.setInfo("�޸ĳɹ�");
//				
//			} else {
//				updatePasswordResult.setCode(ERROR);
//				updatePasswordResult.setInfo("�޸�ʧ��");
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
