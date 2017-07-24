package com.aptrack.controller;

import com.aptrack.entity.OnboardingStatus;
import com.aptrack.service.OnboardingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Murthy on 7/23/2017.
 */
@RestController
public class OnboardingStatusController {

    @Autowired
    private OnboardingStatusService statusService;

    @RequestMapping(
            value = "/api/onboard/status",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OnboardingStatus> update(
            @RequestBody OnboardingStatus status) {
        return new ResponseEntity<OnboardingStatus>(statusService.update(status), HttpStatus.CREATED);
    }
}
