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
public class UpdateRaporRequest {
    private int tckimlik;
    private String taniDetaylari;
    private String taniBasligi;
}
