package com.raapid.genaidemoapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raapid.common.exception.NotFoundException;
import com.raapid.genaidemoapp.bean.PatientBean;
import com.raapid.genaidemoapp.dto.CodeDto;
import com.raapid.genaidemoapp.dto.CodeDto.EvidenceDto;
import com.raapid.genaidemoapp.dto.EncounterDto;
import com.raapid.genaidemoapp.repository.PatientCodeRepository;
import com.raapid.genaidemoapp.repository.PatientRepository;

@Service
@Transactional
public class EncounterService {

	private static final Logger LOG = LoggerFactory.getLogger(EncounterService.class);
	@Autowired
	private PatientCodeRepository	codeRepository;
	
	@Autowired
	private PatientRepository patientRepo;
	
	
	public EncounterDto getEncounterDetail(Integer patientId) {
		EncounterDto encounterDto = new EncounterDto();
		Optional<PatientBean> patientOptional = patientRepo.findById(patientId);
		if(!patientOptional.isPresent()) {
			final String errorMsg = "Patient detail not found";
			LOG.warn(errorMsg+" :: patientId : "+patientId);
			throw new NotFoundException(errorMsg);
		}
		PatientBean patientBean = patientOptional.get();
		encounterDto.setDocumentUrl(patientBean.getDocumentPath());
		encounterDto.setCodes(getCodes(patientId));
		return encounterDto;
	}
	
	private List<CodeDto> getCodes(Integer patientId) {
		List<CodeDto> codeDtos = new ArrayList<>();
		codeRepository.findByPatientId(patientId).forEach(code -> {
			CodeDto codeDto =  new CodeDto(code.getId(), code.getCode(), code.getDescription(), code.getStatus(), "", code.getJustification(), code.getAssessment(), code.getHccCodes());
			code.getCodeEvidenceBeans().forEach(evidence -> {
				String[] pageArray = evidence.getPages().split(",");
				List<Integer> pageList = new ArrayList<>();
				for(String page : pageArray) {
					pageList.add(Integer.parseInt(page.trim()));
                }
				codeDto.addEvidence(new EvidenceDto(evidence.getId(), evidence.getText(), pageList));
			});
			codeDtos.add(codeDto);
		});
		return codeDtos;
	}
}
