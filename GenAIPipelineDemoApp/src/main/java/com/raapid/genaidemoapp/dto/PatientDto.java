package com.raapid.genaidemoapp.dto;

import java.util.Date;

public class PatientDto {

	private Integer id;
	private String name;
	private Date date;
	private String priority;
	private String aiConfidence;
	private Integer age;
	private String mrn;
	private String documentType;
	private String status;
	private Integer totalCodes;
	private Integer reviewNeeded; //like 5
	private Integer timeInQueue;
	
	
	public PatientDto() {
		super();
	}
	public PatientDto(Integer id, String name, Date date, String priority, String aiConfidence, Integer age, String mrn,
			String documentType, String status, Integer totalCodes, Integer reviewNeeded, Integer timeInQueue) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.priority = priority;
		this.aiConfidence = aiConfidence;
		this.age = age;
		this.mrn = mrn;
		this.documentType = documentType;
		this.status = status;
		this.totalCodes = totalCodes;
		this.reviewNeeded = reviewNeeded;
		this.timeInQueue = timeInQueue;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getAiConfidence() {
		return aiConfidence;
	}
	public void setAiConfidence(String aiConfidence) {
		this.aiConfidence = aiConfidence;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMrn() {
		return mrn;
	}
	public void setMrn(String mrn) {
		this.mrn = mrn;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalCodes() {
		return totalCodes;
	}
	public void setTotalCodes(Integer totalCodes) {
		this.totalCodes = totalCodes;
	}
	public Integer getReviewNeeded() {
		return reviewNeeded;
	}
	public void setReviewNeeded(Integer reviewNeeded) {
		this.reviewNeeded = reviewNeeded;
	}
	public Integer getTimeInQueue() {
		return timeInQueue;
	}
	public void setTimeInQueue(Integer timeInQueue) {
		this.timeInQueue = timeInQueue;
	}
	
	
}
