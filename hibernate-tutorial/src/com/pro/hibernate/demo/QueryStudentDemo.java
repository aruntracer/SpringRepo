package com.pro.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//create session factory
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session	
			Session session = factory.getCurrentSession();
			
			try {			
				
				
				// start a transaction
				session.beginTransaction();
				
				// query students
				List<Student> theStudents = session.createQuery("from Student s").getResultList();
				
				// display the students
				displayStudents(theStudents);				
				
				// query students: lastname='Madavi'
				theStudents = session.createQuery("from Student s where s.lastName = 'Madavi'").getResultList();
				
				displayStudents(theStudents);				
				
				// commit the session
				session.getTransaction().commit();
			
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				factory.close();
			}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
