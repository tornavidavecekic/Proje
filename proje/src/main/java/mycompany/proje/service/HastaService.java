/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mycompany.proje.service;

import com.mycompany.proje.repository.Hasta;
import com.mycompany.proje.request.CreateRaporRequest;
import com.mycompany.proje.request.FindRaporRequest;
import com.mycompany.proje.request.UpdateRaporRequest;
import java.util.List;
import my.company.proje.response.FindRaporResponse;
import my.company.proje.response.GetAllRaporResponse;

/**
 *
 * @author canca
 */
public interface HastaService {
    
    public List<GetAllRaporResponse> getAll();
    public List<FindRaporResponse> findId(FindRaporRequest findRaporRequest);
    public List<Hasta> getAllSorting(int PageNo, int recNo);
    public void delId(int id);
    public void add(CreateRaporRequest createRaporRequest);
    public void update(UpdateRaporRequest updateRaporRequest);
}
