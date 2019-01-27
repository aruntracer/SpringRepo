package com.prodapt.dbapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_collector")

public class Data_collector {
	private long id;
	private String object_key;
	private String object_name;
	private String data1;
	private String data2;
	private String data3;
	private String data4;
	private String data5;
	private String data6;
	private String data7;
	
	public Data_collector() {
    }
	
    public Data_collector(String object_key, String object_name, String data1,String data2,String data3,String data4,String data5,String data6,String data7) {
         this.object_key = object_key;
         this.object_name = object_name;
         this.data1 = data1;
         this.data2 = data2;
         this.data3 = data3;
         this.data4 = data4;
         this.data5 = data5;
         this.data6 = data6;
         this.data7 = data7;
    }
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "object_key", nullable = false)
	public String getObject_key() {
		return object_key;
	}
	public void setObject_key(String object_key) {
		this.object_key = object_key;
	}
	@Column(name = "object_name", nullable = false)
	public String getObject_name() {
		return object_name;
	}
	public void setObject_name(String object_name) {
		this.object_name = object_name;
	}
	@Column(name = "data1", nullable = true)
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	@Column(name = "data2", nullable = true)
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	@Column(name = "data3", nullable = true)
	public String getData3() {
		return data3;
	}
	public void setData3(String data3) {
		this.data3 = data3;
	}
	@Column(name = "data4", nullable = true)
	public String getData4() {
		return data4;
	}
	public void setData4(String data4) {
		this.data4 = data4;
	}
	@Column(name = "data5", nullable = true)
	public String getData5() {
		return data5;
	}
	public void setData5(String data5) {
		this.data5 = data5;
	}
	@Column(name = "data6", nullable = true)
	public String getData6() {
		return data6;
	}
	public void setData6(String data6) {
		this.data6 = data6;
	}
	@Column(name = "data7", nullable = false)
	public String getData7() {
		return data7;
	}
	public void setData7(String data7) {
		this.data7 = data7;
	}
	
	
	
}
