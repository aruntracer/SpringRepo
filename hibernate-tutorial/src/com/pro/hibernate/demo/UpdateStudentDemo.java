package com.pro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
				
				myStudent.setFirstName("Veena");
								
				// commit the session
				session.getTransaction().commit();
				
				//update email for all rows
				
				//create session	
				session = factory.getCurrentSession();
				
				// start a transaction
				session.beginTransaction();
				
				session.createQuery("update Student set email='sindhu@gmail.com'").executeUpdate();				
				
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
