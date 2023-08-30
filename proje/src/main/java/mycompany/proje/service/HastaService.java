/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mycompany.proje.service;

import com.mycompany.proje.request.FindRaporRequest;
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
    public void delId(int id);
    
}
