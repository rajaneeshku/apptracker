package com.aptrack.controller;

import com.aptrack.entity.CandidateInfo;
import com.aptrack.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CandidateInfoController {


    @Autowired
    private CandidateService candidateService;

    @RequestMapping(
            value = "/api/candidates/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<CandidateInfo>> getCandidates() {

        Collection<CandidateInfo> candidates = candidateService.findAll();

        return new ResponseEntity<Collection<CandidateInfo>>(candidates,
                HttpStatus.OK);
    }

    @RequestMapping(
            value = "/api/candidates/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateInfo> getCandidates(@PathVariable("id") Long id) {

        CandidateInfo candidate = candidateService.get(id);
        if (candidate == null) {
            return new ResponseEntity<CandidateInfo>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<CandidateInfo>(candidate, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/api/candidates/add",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateInfo> createCandidates(
            @RequestBody CandidateInfo candidate) {

        CandidateInfo savedCandidate = candidateService.create(candidate);

        return new ResponseEntity<CandidateInfo>(savedCandidate, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/api/candidates/update/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateInfo> updateCandidate(
            @RequestBody CandidateInfo candidate) {

        CandidateInfo updatedCandidate = candidateService.update(candidate);
        if (updatedCandidate == null) {
            return new ResponseEntity<CandidateInfo>(
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<CandidateInfo>(updatedCandidate, HttpStatus.OK);
    }



}
