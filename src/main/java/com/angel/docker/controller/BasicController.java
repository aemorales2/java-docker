package com.angel.docker.controller;

import com.angel.docker.service.BasicService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @GetMapping(value="/currentDateTime")
    public String getCurrentDateTime() {
        log.info("returning date");
        return basicService.getCurrentDateTime();
    }
    
}
