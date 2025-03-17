package com.raapid.genaidemoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.raapid.genaidemoapp.dto.EncounterDto;
import com.raapid.genaidemoapp.service.EncounterService;

@RestController
@CrossOrigin(origins = "*")
public class EncounterController {
	
	@Autowired
	private EncounterService encounterService;

	@GetMapping("/patient/{patientId}/encounter")
	public ResponseEntity<EncounterDto> getEncounter(@PathVariable Integer patientId) {
		return ResponseEntity.ok(encounterService.getEncounterDetail(patientId));
	}
}
