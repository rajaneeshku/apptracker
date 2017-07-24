package com.aptrack.controller;

import com.aptrack.entity.OnboardingSummaryView;
import com.aptrack.entity.OnboardingView;
import com.aptrack.service.OnboardingViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Murthy on 7/23/2017.
 */

@RestController
public class OnboardingViewController {
    @Autowired
    private OnboardingViewService onboardingViewService;


    @RequestMapping(
            value = "/api/onboard/list",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OnboardingView>> list() {

        return new ResponseEntity<List<OnboardingView>>(onboardingViewService.viewList(), HttpStatus.OK);
    }


    @RequestMapping(
            value = "/api/onboard/view/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OnboardingSummaryView> summary(@PathVariable("id") Long id) {

        return new ResponseEntity<OnboardingSummaryView>(onboardingViewService.summary(id), HttpStatus.OK);
    }




}
