package com.sbi.benefits.repository;

import com.sbi.benefits.models.BenefitReward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitRewardRepository extends JpaRepository<BenefitReward,Integer> {
}
