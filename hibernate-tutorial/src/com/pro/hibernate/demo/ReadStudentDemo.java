package com.pro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		//create session factory
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session	
			Session session = factory.getCurrentSession();
			
			try {			
				
				
				// create a student object
				System.out.println("Creating a new strudent object");
				Student tempStudent = new Student("Bindhu","Kumar","bindhu@prod.com");
				// start a transaction
				session.beginTransaction();
				// save the student object
				session.save(tempStudent);
				// commit transaction
				session.getTransaction().commit();
				
				// code for reading the student entry in database
				//get current session
				session = factory.getCurrentSession();
				session.beginTransaction();
				
				//retrieve student based on the id: primary key
				System.out.println("\nGetting student with id: "+tempStudent.getId());
				
				//store the row which belongs to the Id in myStudent object
				Student myStudent = session.get(Student.class,tempStudent.getId());
				System.out.println("Get complete "+myStudent);
				
				session.getTransaction().commit();
				System.out.println("Done!");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				factory.close();
			}
	}

}
