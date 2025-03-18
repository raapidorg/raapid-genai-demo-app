package com.raapid.genaidemoapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raapid.common.utility.DateContent;
import com.raapid.common.utility.DateUtility;
import com.raapid.genaidemoapp.bean.CodeEvidenceBean;
import com.raapid.genaidemoapp.bean.PatientBean;
import com.raapid.genaidemoapp.bean.PatientCodeBean;
import com.raapid.genaidemoapp.dto.CreatePatientRequestDto;
import com.raapid.genaidemoapp.dto.CreatePatientRequestDto.CodeFindingDetail;
import com.raapid.genaidemoapp.dto.CreatePatientRequestDto.EvidenceFindingDetail;
import com.raapid.genaidemoapp.dto.PatientDto;
import com.raapid.genaidemoapp.repository.PatientCodeRepository;
import com.raapid.genaidemoapp.repository.PatientRepository;

@Service
@Transactional
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientCodeRepository codeRepository;
	
	public List<PatientDto> getPatients() {
		List<PatientDto> patients = new ArrayList<>();
		List<PatientBean> patientBeans = patientRepository.findAll();
		patientBeans.forEach(patientBean -> {
			patients.add(generatePatientDto(patientBean));
		});
		return patients;
	}
	
	public PatientDto generatePatientDto(PatientBean patientBean) {
		return new PatientDto(patientBean.getId(), patientBean.getName(), patientBean.getDate(), "High", "80%",
				patientBean.getAge(), "MRN_"+patientBean.getName(), patientBean.getDocumentName()	, "In Queue", patientBean.getTotalCodes(), 0, 10);
	}
	
	public Integer addPatient(CreatePatientRequestDto createPatientRequestDto) {
		//TODO CJ : we need code description at code level. 2. we need hcc list at code. 3. we need document name. 4. we need document path
		PatientBean patientBean = new PatientBean();
		patientBean.setName("Patient_"+DateContent.getCurrentGMTDateString());
		patientBean.setAge(25);
		patientBean.setDate(new Date());
		patientBean.setDocumentName("document_"+DateContent.getCurrentGMTDateString());
		patientBean.setDocumentPath("path");
		
		Map<String, List<CodeFindingDetail>> clinical_findings = createPatientRequestDto.getClinical_findings();
		patientBean.setTotalCodes(clinical_findings.size());
		patientRepository.save(patientBean);
		
		
		clinical_findings.forEach((key, value) -> {
			PatientCodeBean patientCodeBean = new PatientCodeBean();
			patientCodeBean.setPatientId(patientBean.getId());
			patientCodeBean.setCode(key);
			patientCodeBean.setStatus("review");
			patientCodeBean.setHccCodes("");
			
			StringBuilder justificationBuilder = new StringBuilder();
			StringBuilder assessmentBuilder = new StringBuilder();
			StringBuilder codeDescBuilder = new StringBuilder();
			
			List<CodeEvidenceBean> codeEvidenceBeans = new ArrayList<>();
			value.forEach(codeFindingDetail -> {
                justificationBuilder.append(codeFindingDetail.getJustification());
                assessmentBuilder.append(codeFindingDetail.getAssessment());
                codeDescBuilder.append(codeFindingDetail.getIcd_10_cm_code_description());
                codeFindingDetail.getEvidence_texts().forEach(evidence -> {
                    CodeEvidenceBean codeEvidenceBean = new CodeEvidenceBean();
                    codeEvidenceBean.setText(evidence.getText_evidence());
                    
                    String pages = "";
					for (Integer page : evidence.getPage_number()) {
						pages = pages + page + ",";
					}
                    pages = pages.substring(0, pages.length()-1);
                    codeEvidenceBean.setPages(pages);
                    codeEvidenceBean.setEvidenceCodeBean(patientCodeBean);
                	codeEvidenceBeans.add(codeEvidenceBean);
                });
            });
			patientCodeBean.setDescription(codeDescBuilder.toString());
            patientCodeBean.setJustification(justificationBuilder.toString());
            patientCodeBean.setAssessment(assessmentBuilder.toString());
            patientCodeBean.setCodeEvidenceBeans(codeEvidenceBeans);
            codeRepository.save(patientCodeBean);
		});
		return patientBean.getId();
	}
}
