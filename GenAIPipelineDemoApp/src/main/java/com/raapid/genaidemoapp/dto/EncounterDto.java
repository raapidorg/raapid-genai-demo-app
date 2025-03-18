package com.raapid.genaidemoapp.dto;

import java.util.List;

public class EncounterDto {

	private String documentUrl;
	private PatientDto patient;
	private List<CodeDto> codes;
	
	
	public String getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}
	public List<CodeDto> getCodes() {
		return codes;
	}
	public void setCodes(List<CodeDto> codes) {
		this.codes = codes;
	}
	public PatientDto getPatient() {
		return patient;
	}
	public void setPatient(PatientDto patient) {
		this.patient = patient;
	}
	
	
}
