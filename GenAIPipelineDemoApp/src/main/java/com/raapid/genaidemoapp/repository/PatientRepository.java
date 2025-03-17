package com.raapid.genaidemoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raapid.genaidemoapp.bean.PatientBean;

@Repository
public interface PatientRepository extends JpaRepository<PatientBean, Integer> {

}
