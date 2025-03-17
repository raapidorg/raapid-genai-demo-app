package com.raapid.genaidemoapp.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "patient_code")
public class PatientCodeBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private int id;

	@Column(name = "code")
	private String code;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "justification")
	private String justification;
	
	@Column(name = "assessment")
	private String assessment;
	
	@Column(name = "patient_id")
	private Integer patientId;
	
	@Column(name = "hcc_codes")
	private String hccCodes;
	
	@OneToMany(mappedBy = "evidenceCodeBean", cascade = javax.persistence.CascadeType.ALL)
	private List<CodeEvidenceBean> codeEvidenceBeans;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getAssessment() {
		return assessment;
	}

	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public List<CodeEvidenceBean> getCodeEvidenceBeans() {
		return codeEvidenceBeans;
	}

	public void setCodeEvidenceBeans(List<CodeEvidenceBean> codeEvidenceBeans) {
		this.codeEvidenceBeans = codeEvidenceBeans;
	}

	public String getHccCodes() {
		return hccCodes;
	}

	public void setHccCodes(String hccCodes) {
		this.hccCodes = hccCodes;
	}

	
}
