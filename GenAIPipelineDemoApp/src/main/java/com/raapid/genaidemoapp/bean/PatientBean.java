package com.raapid.genaidemoapp.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_mst")
public class PatientBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "document_name")
	private String documentName;
	
	@Column(name = "total_codes")
	private Integer totalCodes;
	
	@Column(name = "document_path")
	private String documentPath;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Integer getTotalCodes() {
		return totalCodes;
	}

	public void setTotalCodes(Integer totalCodes) {
		this.totalCodes = totalCodes;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	
	

}
