package com.pro.sqlservercrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Component
@Entity
@Table(name = "employees")
@ApiModel(description = "All details about Employees")
public class Employees {
	@ApiModelProperty(notes="sno should be an integee")
	private Long sno;
	@ApiModelProperty(notes = "name should be alpha")
	private String name;
	private int age;
	
	public Employees() {};
	
	public Employees(Long sno, String name, int age) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
	}
	
	@Id
	@Column(name = "sno")
	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [sno=" + sno + ", name=" + name + ", age=" + age + "]";
	}
		
}
