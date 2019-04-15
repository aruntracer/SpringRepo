package com.pro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		//create session factory
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
			try {			
				
				int studentId = 1;
				
				//create session	
				Session session = factory.getCurrentSession();
				
				// start a transaction
				session.beginTransaction();
				
				Student myStudent = session.get(Student.class,studentId);
				//method 1
				
				session.delete(myStudent);
				
				// method 2
				
				session.createQuery("delete from Student s where s.id=2").executeUpdate();
				
				// commit the session
				session.getTransaction().commit();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				factory.close();
			}
	}
}
