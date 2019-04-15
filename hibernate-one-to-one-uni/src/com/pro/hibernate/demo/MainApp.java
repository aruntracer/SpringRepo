package com.pro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.hibernate.demo.entity.Instructor;
import com.pro.hibernate.demo.entity.InstructorDetails;

public class MainApp {

	public static void main(String[] args) {
		//create session factory
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
														.addAnnotatedClass(Instructor.class)
														.addAnnotatedClass(InstructorDetails.class)
														.buildSessionFactory();
			try {			
				
				//create session	
				Session session = factory.getCurrentSession();
				
				// create objects for entities
				Instructor tempIns = new Instructor("Arun","K1","ak@pro.com");
				InstructorDetails tempInsDet = new InstructorDetails("http://soload.com","love to code");
				
				// associate the objects
				tempIns.setInstructorDetail(tempInsDet);
				
				// start a transaction
				session.beginTransaction();
				
				// save the instructor, this will also save the details object since casecadeType.ALL
				session.save(tempIns);
				// commit transaction
				session.getTransaction().commit();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				factory.close();
			}
	}

}
