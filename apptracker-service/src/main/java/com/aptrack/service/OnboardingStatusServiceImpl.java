package com.aptrack.service;

import com.aptrack.entity.OnboardingStatus;
import com.aptrack.repository.OnboardingStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Murthy on 7/22/2017.
 */
@Service
public class OnboardingStatusServiceImpl implements OnboardingStatusService {

    @Autowired
    private OnboardingStatusRepository onboardingStatusRepository;

    @Override
    public OnboardingStatus get(Long aid) {
        return onboardingStatusRepository.findOne(aid);
    }

    @Override
    public OnboardingStatus update(OnboardingStatus status) {

        //TODO null values of DATETIME feilds in DB table tobe fixed.
        return onboardingStatusRepository.save(status);
    }

    @Override
    public OnboardingStatus update(Long aid) {
        return update(initialDetails(aid));
    }


    private OnboardingStatus initialDetails(Long aid){
        Integer DEFAULT_BG_CHECK = 100;
        Integer DEFAULT_DEMOGRAPH_CHECK = 200;

        OnboardingStatus initialStatus = new OnboardingStatus();
        initialStatus.setAid(aid);
        initialStatus.setBgCheck(DEFAULT_BG_CHECK);
        initialStatus.setDemograph(DEFAULT_DEMOGRAPH_CHECK);
        initialStatus.setComments("Initiated.");
        initialStatus.setLastUpdBy("Admin");

        return initialStatus;
    }


}
