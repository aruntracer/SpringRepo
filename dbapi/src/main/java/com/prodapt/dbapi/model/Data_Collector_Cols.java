package com.prodapt.dbapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_collector_cols")

public class Data_Collector_Cols {
	private long id;
	private String object_key;
	private String column_name;
	private String column_value;
	
	public Data_Collector_Cols() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data_Collector_Cols(String object_key, String column_name, String column_value) {
		super();
		this.object_key = object_key;
		this.column_name = column_name;
		this.column_value = column_value;
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
	@Column(name = "column_name", nullable = false)
	public String getColumn_name() {
		return column_name;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	@Column(name = "column_value", nullable = false)
	public String getColumn_value() {
		return column_value;
	}

	public void setColumn_value(String column_value) {
		this.column_value = column_value;
	}
		
}
