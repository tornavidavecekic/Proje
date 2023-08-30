/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.manager;

import com.mycompany.proje.mapper.ModelMapperService;
import com.mycompany.proje.repository.Patient;
import com.mycompany.proje.repository.PatientRepository;
import com.mycompany.proje.request.CreateRaporRequest;
import com.mycompany.proje.request.FindRaporRequest;
import com.mycompany.proje.request.UpdateRaporRequest;
import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import my.company.proje.response.FindReportResponse;
import my.company.proje.response.GetAllReportResponse;
import mycompany.proje.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author canca
 */
@Service
@AllArgsConstructor
public class PatientManager implements PatientService{
    
    @Autowired
    private PatientRepository patientRepository;
    
    private ModelMapperService modelMapperService;

    

    @Override
    public List<GetAllReportResponse> getAll() {
        List<Patient> raporlar = patientRepository.findAll();
        List<GetAllReportResponse> personResponse = raporlar.stream().map(rapor->this.modelMapperService
                .forResponse().map(rapor, GetAllReportResponse.class)).collect(Collectors.toList());
        return personResponse;
    }
    
    @Override
    public List<Patient> getAllSorting(int PageNo, int recCount){
        Pageable pageable = (Pageable) PageRequest.of(PageNo, recCount);
        return patientRepository.findAll(pageable);
    }
    

    @Override
    public List<FindReportResponse> findId(FindRaporRequest findRaporRequest) {
        List<Patient> reports = patientRepository.findAll();
        return null;
    }

    @Override
    public void delId(int id) {
        patientRepository.deleteById(id);
    }

    @Override
    public void add(CreateRaporRequest createRaporRequest) {
        Patient patient = this.modelMapperService.forRequest().map(createRaporRequest, Patient.class);
        this.patientRepository.save(patient);
    }

    @Override
    public void update(UpdateRaporRequest updateRaporRequest) {
        Patient patient = this.modelMapperService.forRequest().map(updateRaporRequest, Patient.class);
        this.patientRepository.save(patient);
    }
    
}
