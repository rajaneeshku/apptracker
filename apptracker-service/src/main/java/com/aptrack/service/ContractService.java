package com.aptrack.service;

import com.aptrack.entity.ContractInfo;

import java.util.Collection;

/**
 * Created by Murthy on 7/18/2017.
 */
public interface ContractService {
    Collection<ContractInfo> findAll();

    ContractInfo get(Long aid);

    ContractInfo create(ContractInfo contract);

    ContractInfo update(ContractInfo contract);

}
