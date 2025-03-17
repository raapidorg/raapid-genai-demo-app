package com.raapid.genaidemoapp.dto;

import java.util.List;

public class EncounterDto {

	private String documentUrl;
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
	
	
}
