package com.example.smittetryk01.controller;

import com.example.smittetryk01.model.County;
import com.example.smittetryk01.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountyRESTController {

    @Autowired
    CountyRepository countyRepository;

    @GetMapping("/counties")
    public List<County> getAllCounties() {
        return countyRepository.findAll();

    }
}
