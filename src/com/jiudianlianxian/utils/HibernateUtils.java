package com.jiudianlianxian.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * 
 * @Title: HibernateUtils
 * @Description: 给此类一个描述
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: Farm
 * @author fupengpeng
 * @date 2017年9月26日 上午10:03:13
 *
 */
public class HibernateUtils {

	
	/**
	 * 用于生产SessionFactory对象
	 *     SessionFactory对象产生耗资源，故只生产一个SessionFactory对象
	 */
	private static final Configuration configuration;
	private static final SessionFactory sessionFactory;
	
	static {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	
	//提供方法返回与本地线程绑定的session对象的方法
	public static Session getSessionObject(){
		return sessionFactory.getCurrentSession();  
	}
	
	//提供方法返回SessionFactory对象
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	 
	public static void main(String[] args) {
		
	}
	
}
