package com.aptrack.repository;

import com.aptrack.entity.CandidateInfo;
import com.aptrack.entity.OnboardingSummaryView;
import com.aptrack.entity.OnboardingView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Murthy on 7/23/2017.
 */
@Repository
public interface OnboardingStatusViewRepsitory extends CrudRepository<CandidateInfo,Long> {
    //@Query("SELECT c FROM CandidateInfo c WHERE c.onboardingStatus = :id")
   // @Query("SELECT c FROM CandidateInfo c WHERE c.onboardingStatus = :id")
    @Query("SELECT c FROM OnboardingView c left join c.onboardingStatus s WHERE s.aid = :id")
    List<OnboardingView> findStatus(@Param("id") Long id);
    @Query("SELECT c FROM OnboardingView c left join c.onboardingStatus s")
    List<OnboardingView> findStatusAll();

    @Query("SELECT o FROM OnboardingSummaryView o left join o.onboardingStatus s left join o.contractInfo c  where o.aid =:id")
    OnboardingSummaryView findStatusSummary(@Param("id") Long id);



   // @Query("SELECT o FROM OnboardingView o left join o.onboardingStatus s ")
   // List<OnboardingView> findStatusViewAll();
}
