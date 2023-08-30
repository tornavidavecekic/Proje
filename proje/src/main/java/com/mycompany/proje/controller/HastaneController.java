/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.controller;

import java.util.List;
import my.company.proje.response.GetAllRaporResponse;
import mycompany.proje.service.HastaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author canca
 */
@RestController
@RequestMapping("/hasta/")
public class HastaneController {
    
    HastaService hastaService;

    public HastaneController(HastaService hastaService) {
        this.hastaService = hastaService;
    }
    
    @GetMapping("/hastalar")
    public List<GetAllRaporResponse> getAll(){
        return hastaService.getAll();
    }
    
}
