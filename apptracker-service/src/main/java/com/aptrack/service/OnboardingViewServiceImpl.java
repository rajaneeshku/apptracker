package com.aptrack.service;

import com.aptrack.entity.OnboardingSummaryView;
import com.aptrack.entity.OnboardingView;
import com.aptrack.repository.OnboardingStatusViewRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Murthy on 7/23/2017.
 */
@Service
public class OnboardingViewServiceImpl implements OnboardingViewService {

    @Autowired
    private OnboardingStatusViewRepsitory viewRepsitory;

    @Override
    public List<OnboardingView> viewList() {
        return viewRepsitory.findStatusAll();
    }

    @Override
    public OnboardingSummaryView summary(Long aid) {
        return viewRepsitory.findStatusSummary(aid);
    }
}
