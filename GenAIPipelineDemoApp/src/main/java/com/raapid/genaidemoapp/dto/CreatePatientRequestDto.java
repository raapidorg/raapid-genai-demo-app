package com.raapid.genaidemoapp.dto;

import java.util.List;
import java.util.Map;

public class CreatePatientRequestDto {

	private String documentName;
	private String documentPath;
	private String patientName;
	private Map<String, List<CodeFindingDetail>> clinical_findings;
	
	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Map<String, List<CodeFindingDetail>> getClinical_findings() {
		return clinical_findings;
	}

	public void setClinical_findings(Map<String, List<CodeFindingDetail>> clinical_findings) {
		this.clinical_findings = clinical_findings;
	}

	public static class CodeFindingDetail {
		private String icd_10_cm_code;
		private String icd_10_cm_code_description;
		private String assessment;
		private String justification;
		private List<String> hcc_codes;
		private List<EvidenceFindingDetail> evidence_texts;
		public String getIcd_10_cm_code() {
			return icd_10_cm_code;
		}
		public void setIcd_10_cm_code(String icd_10_cm_code) {
			this.icd_10_cm_code = icd_10_cm_code;
		}
		public String getIcd_10_cm_code_description() {
			return icd_10_cm_code_description;
		}
		public void setIcd_10_cm_code_description(String icd_10_cm_code_description) {
			this.icd_10_cm_code_description = icd_10_cm_code_description;
		}
		public String getAssessment() {
			return assessment;
		}
		public void setAssessment(String assessment) {
			this.assessment = assessment;
		}
		public String getJustification() {
			return justification;
		}
		public void setJustification(String justification) {
			this.justification = justification;
		}
		public List<String> getHcc_codes() {
			return hcc_codes;
		}
		public void setHcc_codes(List<String> hcc_codes) {
			this.hcc_codes = hcc_codes;
		}
		public List<EvidenceFindingDetail> getEvidence_texts() {
			return evidence_texts;
		}
		public void setEvidence_texts(List<EvidenceFindingDetail> evidence_texts) {
			this.evidence_texts = evidence_texts;
		}
		@Override
		public String toString() {
			return "CodeFindingDetail [icd_10_cm_code=" + icd_10_cm_code + ", icd_10_cm_code_description="
					+ icd_10_cm_code_description + ", assessment=" + assessment + ", justification=" + justification
					+ ", hcc_codes=" + hcc_codes + ", evidence_texts=" + evidence_texts + "]";
		}
		
	}
	
	public static class EvidenceFindingDetail {
		private String text_evidence;
		private List<Integer> page_number;
		public String getText_evidence() {
			return text_evidence;
		}
		public void setText_evidence(String text_evidence) {
			this.text_evidence = text_evidence;
		}
		public List<Integer> getPage_number() {
			return page_number;
		}
		public void setPage_number(List<Integer> page_number) {
			this.page_number = page_number;
		}
		@Override
		public String toString() {
			return "EvidenceFindingDetail [text_evidence=" + text_evidence + ", page_number=" + page_number + "]";
		}
		
	}

	@Override
	public String toString() {
		return "CreatePatientRequestDto [documentName=" + documentName + ", documentPath=" + documentPath
				+ ", patientName=" + patientName + ", clinical_findings=" + clinical_findings + "]";
	}
	
}
