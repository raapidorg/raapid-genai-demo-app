package com.raapid.genaidemoapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raapid.genaidemoapp.bean.PatientBean;
import com.raapid.genaidemoapp.bean.PatientCodeBean;

@Repository
public interface PatientCodeRepository extends JpaRepository<PatientCodeBean, Integer> {

	List<PatientCodeBean> findByPatientId(Integer patientId);
}
