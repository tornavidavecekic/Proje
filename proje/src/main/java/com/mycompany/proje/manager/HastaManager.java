/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.manager;

import com.mycompany.proje.mapper.ModelMapperService;
import com.mycompany.proje.repository.Hasta;
import com.mycompany.proje.repository.HastaRepository;
import com.mycompany.proje.request.CreateRaporRequest;
import com.mycompany.proje.request.FindRaporRequest;
import com.mycompany.proje.request.UpdateRaporRequest;
import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import my.company.proje.response.FindRaporResponse;
import my.company.proje.response.GetAllRaporResponse;
import mycompany.proje.service.HastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author canca
 */
@Service
@AllArgsConstructor
public class HastaManager implements HastaService{
    
    @Autowired
    private HastaRepository hastaRepository;
    
    private ModelMapperService modelMapperService;

    

    @Override
    public List<GetAllRaporResponse> getAll() {
        List<Hasta> raporlar = hastaRepository.findAll();
        List<GetAllRaporResponse> personResponse = raporlar.stream().map(rapor->this.modelMapperService
                .forResponse().map(rapor, GetAllRaporResponse.class)).collect(Collectors.toList());
        return personResponse;
    }
    
    @Override
    public List<Hasta> getAllSorting(int PageNo, int recCount){
        Pageable pageable = (Pageable) PageRequest.of(PageNo, recCount);
        return hastaRepository.findAll(pageable);
    }
    

    @Override
    public List<FindRaporResponse> findId(FindRaporRequest findRaporRequest) {
        List<Hasta> raporlar = hastaRepository.findAll();
        return null;
    }

    @Override
    public void delId(int id) {
        hastaRepository.deleteById(id);
    }

    @Override
    public void add(CreateRaporRequest createRaporRequest) {
        Hasta hasta = this.modelMapperService.forRequest().map(createRaporRequest, Hasta.class);
        this.hastaRepository.save(hasta);
    }

    @Override
    public void update(UpdateRaporRequest updateRaporRequest) {
        Hasta hasta = this.modelMapperService.forRequest().map(updateRaporRequest, Hasta.class);
        this.hastaRepository.save(hasta);
    }
    
}
