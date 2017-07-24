package com.aptrack.service;

import com.aptrack.entity.OnboardingStatus;
import com.aptrack.entity.OnboardingSummaryView;
import com.aptrack.entity.OnboardingView;

import java.util.List;

/**
 * Created by Murthy on 7/23/2017.
 */
public interface OnboardingViewService {

    List<OnboardingView> viewList();
   // OnboardingStatus update(OnboardingStatus status);
    OnboardingSummaryView summary(Long aid);
}
