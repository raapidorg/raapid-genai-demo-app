package com.raapid.genaidemoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raapid.genaidemoapp.bean.CodeEvidenceBean;

@Repository
public interface CodeEvidenceRepository extends JpaRepository<CodeEvidenceBean, Integer> {

}
