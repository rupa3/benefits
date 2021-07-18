package com.sbi.benefits.repository;

import com.sbi.benefits.models.BenefitTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitRepository extends JpaRepository<BenefitTable,Integer> {
}
