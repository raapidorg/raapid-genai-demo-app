package com.raapid.genaidemoapp.dto;

import java.util.ArrayList;
import java.util.List;

public class CodeDto {

	
	private Integer id;
	private String code;
	private String description;
	private String status;//review,accepted,rejected
	private List<EvidenceDto> evidenceList;
	private String aiAction;
	private String justification;
	private String assessment;
	private String hccCodes;
	
	public CodeDto() {
		super();
	}
	
	public CodeDto(Integer id, String code, String description, String status, String aiAction,
			String justification, String assessment, String hccCodes) {
		super();
		this.id = id;
		this.code = code;
		this.description=description;
		this.status = status;
		this.aiAction = aiAction;
		this.justification = justification;
		this.assessment = assessment;
		this.hccCodes = hccCodes;
	}
	
	public String getHccCodes() {
		return hccCodes;
	}

	public void setHccCodes(String hccCodes) {
		this.hccCodes = hccCodes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<EvidenceDto> getEvidenceList() {
		return evidenceList;
	}

	public void setEvidenceList(List<EvidenceDto> evidenceList) {
		this.evidenceList = evidenceList;
	}
	
	public void addEvidence(EvidenceDto evidence) {
		if(this.evidenceList== null) {
			this.evidenceList = new ArrayList<>();
		}
		this.evidenceList.add(evidence);
	}

	public String getAiAction() {
		return aiAction;
	}

	public void setAiAction(String aiAction) {
		this.aiAction = aiAction;
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

	public static class EvidenceDto {
		private Integer id;
		private String text;
		private List<Integer> pages;
		
		public EvidenceDto() {
			super();
		}
		
		public EvidenceDto(Integer id, String text, List<Integer> pages) {
			super();
			this.id = id;
			this.text = text;
			this.pages = pages;
		}



		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public List<Integer> getPages() {
			return pages;
		}
		public void setPages(List<Integer> pages) {
			this.pages = pages;
		}
		
		
	}
}
