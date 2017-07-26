package com.aptrack.entity;

import com.aptrack.common.FormerWorker;
import com.aptrack.common.YesORNo;
import com.aptrack.entity.converter.LocalDateConverter;
import com.aptrack.entity.converter.LocalDateTimeConverter;
import lombok.Data;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Murthy on 7/16/2017.
 */
@Data
@Entity
public class ContractInfo {

    @Id
    private Long aid;
    private Long appprovedContactNum;

    @Convert(converter = LocalDateConverter.class)
    private String contractEndDte;

    @Convert(converter = LocalDateConverter.class)
    private String cwAssignmentEndDte;
    private String candidateRoleTyp; //TODO: ENUM
    private String returnStatus;
    private FormerWorker formaerWorker;
    private String priorSid;
    private String priorDates;
    private String supplierName;
    private String cwWorkCity;
    private String cwWorkLocation;
    private String cwWorkMailDrop;
    private String homeZip;
    private YesORNo usArmedForces;
    private YesORNo registeredNotaryPublic;
    private YesORNo csiInfoAccess;
    private YesORNo candidateReferredToYou;
    private String referralOriginate;
    private YesORNo candiateSeletedWithinGuidelines;
    private String currentAddress;
    private String serviceType;
    private String ITORNonIT;
    private String fullORPartTime;
    private String paymentType;
    private String costCenter;
    private String cwJobCode;
    private String lobName;

    @Convert(converter = LocalDateConverter.class)
    private String cwAssignmentStartDte;
    private String sponsorId;
    private String sponsorLastName;
    private String sponsorFirstName;
    private YesORNo emailRequired;
    private String spocEmail;

}
