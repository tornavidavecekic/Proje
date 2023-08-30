/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mycompany.proje.service;

import com.mycompany.proje.repository.Patient;
import com.mycompany.proje.request.CreateRaporRequest;
import com.mycompany.proje.request.FindRaporRequest;
import com.mycompany.proje.request.UpdateRaporRequest;
import java.util.List;
import my.company.proje.response.FindReportResponse;
import my.company.proje.response.GetAllReportResponse;

/**
 *
 * @author canca
 */
public interface PatientService {
    
    public List<GetAllReportResponse> getAll();
    public List<FindReportResponse> findId(FindRaporRequest findRaporRequest);
    public List<Patient> getAllSorting(int PageNo, int recNo);
    public void delId(int id);
    public void add(CreateRaporRequest createRaporRequest);
    public void update(UpdateRaporRequest updateRaporRequest);
}
