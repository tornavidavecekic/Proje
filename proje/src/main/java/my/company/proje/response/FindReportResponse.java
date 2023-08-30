/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.proje.response;

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
public class FindReportResponse {
    private int tckimlik;
    private String taniBasligi;
    private String taniDetaylari;
    private String taniTarih;
    private String taniResim;
}
