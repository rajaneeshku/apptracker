package com.aptrack.service;

import com.aptrack.entity.CandidateInfo;

import java.util.Collection;

/**
 * Created by Murthy on 7/16/2017.
 */
public interface CandidateService {
    Collection<CandidateInfo> findAll();

    CandidateInfo get(Long aid);

    CandidateInfo create(CandidateInfo candidate);

    CandidateInfo update(CandidateInfo candidate);

}
