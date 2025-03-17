package com.raapid.genaidemoapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "code_evidence")
public class CodeEvidenceBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private int id;

	@Column(name = "text")
	private String text;
	
	@Column(name = "pages")
	private String pages;
	
	@Column(name = "code_id", insertable = false, updatable = false)
	private Integer codeId;
	
	@ManyToOne
	@JoinColumn(name = "code_id")
	private PatientCodeBean evidenceCodeBean;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public Integer getCodeId() {
		return codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public PatientCodeBean getEvidenceCodeBean() {
		return evidenceCodeBean;
	}

	public void setEvidenceCodeBean(PatientCodeBean evidenceCodeBean) {
		this.evidenceCodeBean = evidenceCodeBean;
	}

}
