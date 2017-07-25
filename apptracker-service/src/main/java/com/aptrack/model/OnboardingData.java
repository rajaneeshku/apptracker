package com.aptrack.model;

import com.aptrack.entity.CandidateInfo;
import com.aptrack.entity.ContractInfo;
import lombok.Builder;

/**
 * Created by Murthy on 7/19/2017.
 */
@Builder
public class OnboardingData {

    private CandidateInfo candidateInfo;
    private ContractInfo contractInfo;

}
