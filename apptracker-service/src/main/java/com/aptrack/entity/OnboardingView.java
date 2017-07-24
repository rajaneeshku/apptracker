package com.aptrack.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Murthy on 7/15/2017.
 */

@Data
@Entity
@Table(name = "candidate_info",schema = "apptracker")
public class OnboardingView {

    @Id
    private Long aid;
    private String lastName;
    private String firstName;
    private String midInitial;
    private String prefFirstName;
    private String email;
    private String contactPhone;
    private Integer curStatus;

    @OneToOne
    @JoinColumn(name="AID", nullable=true)
    private OnboardingStatus onboardingStatus;
}
