package org.prodapt.spring_hello;
/**
 * Spring bean
 * 
 */
public class Hello_World {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Spring Hello "+name);
	}
}
