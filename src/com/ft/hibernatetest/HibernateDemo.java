package com.ft.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.ft.entity.User;
import com.ft.utils.HibernateUtils;
import com.ft.dao.*;
public class HibernateDemo {

	/**
	 * 
	 */
	@Test
	public void testAdd() {
		
//		��һ�� ����hibernate���������ļ�
		// ��src�����ҵ�������hibernate.cfg.xml
		//��hibernate�����װ����
//		Configuration cfg = new Configuration();
//		cfg.configure();
		
//		�ڶ��� ����SessionFactory����
		//��ȡhibernate���������ļ����ݣ�����sessionFactory
		//�ڹ����У�����ӳ���ϵ�����������ݿ�����ѱ���
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
	
		//����ʹ���˹����࣬���Ե�һ���͵ڶ�������ʹ���±�һ�����
//		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
//		������ ʹ��SessionFactory����session����
		// ����������
//		Session session = sessionFactory.openSession();
		
//		���Ĳ� ��������
//		Transaction tx = session.beginTransaction();

//		���岽 д�����߼� crud����
	
		UserDao dao=new UserDao();
        User test= new User();
        test.setUsername("����A��");
        test.setAddress("�ձ�����");;
		dao.add(test);
		
//		������ �ύ����
//		tx.commit();

//		���߲� �ر���Դ
//		session.close();
//		sessionFactory.close();
//		

	}
}
