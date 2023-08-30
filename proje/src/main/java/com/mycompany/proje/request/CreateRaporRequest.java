/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author canca
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRaporRequest {
    
    private int tckimlik;
    private String taniBasligi;
    private String taniDetaylari;
    private String taniTarih;
    private String taniResim;
    private int laborantNo;
    
}
