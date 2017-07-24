package com.aptrack.repository;

import com.aptrack.entity.ContractInfo;
import com.aptrack.entity.OnboardingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Murthy on 7/22/2017.
 */
public interface OnboardingStatusRepository extends JpaRepository<OnboardingStatus,Long> {
}
