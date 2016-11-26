package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab14A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=AHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("ab","jha","ab@jlc","9876");
			session.save(cust);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
			}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}

}
