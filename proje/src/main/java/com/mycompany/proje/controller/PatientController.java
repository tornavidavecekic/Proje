/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.controller;

import java.util.List;
import my.company.proje.response.GetAllReportResponse;
import mycompany.proje.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author canca
 */
@RestController
@RequestMapping("/hasta/")
public class PatientController {
    
    PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    
    @GetMapping("/hastalar")
    public List<GetAllReportResponse> getAll(){
        return patientService.getAll();
    }
    
}
