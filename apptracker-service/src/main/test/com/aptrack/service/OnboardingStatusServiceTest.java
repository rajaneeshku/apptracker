package com.aptrack.service;

import com.aptrack.entity.OnboardingStatus;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

import static org.junit.Assert.*;

/**
 * Created by Murthy on 7/22/2017.
 */
public class OnboardingStatusServiceTest {
    private OnboardingStatus onboardingStatus;

    @Before
    public void init(){
        /*onboardingStatus = new OnboardingStatus();
        onboardingStatus.setAid(111L);
        onboardingStatus.setBgCheck(100);
        onboardingStatus.setComments("Comments123");
        onboardingStatus.setDemograph(200);
        onboardingStatus.setLastUpdBy("Murthy");*/
    }

    @Autowired
    private OnboardingStatusService onboardingStatusService;

    @Test
    public void get() throws Exception {

    }

    @Test
    public void update() throws Exception {

        new OnboardingStatusServiceImpl().update(onboardingStatus);
    }


}