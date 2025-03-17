package com.raapid.genaidemoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raapid.genaidemoapp.dto.CreatePatientRequestDto;
import com.raapid.genaidemoapp.dto.PatientDto;
import com.raapid.genaidemoapp.service.PatientService;


@RestController
@CrossOrigin(origins = "*")
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	@GetMapping("/patient")
	public ResponseEntity<List<PatientDto>> getPatients() {
		return new ResponseEntity<List<PatientDto>>(patientService.getPatients(), HttpStatus.OK);
	}
	
	
	@PostMapping("/patient")
	public ResponseEntity<Integer> addPatient(@RequestBody CreatePatientRequestDto createPatientRequestDto) {
		System.out.println("PatientController.addPatient()"+createPatientRequestDto);
		Integer patientId = patientService.addPatient(createPatientRequestDto);
		return new ResponseEntity<Integer>(patientId, HttpStatus.CREATED);
	}
	
	
}
