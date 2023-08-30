/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author canca
 */
@Table(name = "rapor")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Report {
    @Id
    @Column(name = "tckimlik")
    int tcKimlik;
    @Id
    @Column(name = "laborant_no")
    int laborantNo;
    @Column(name = "tani_basligi")
    String taniBasligi;
    @Column(name = "tani_detaylari")
    String taniDetaylari;
    @Column(name = "tani_tarih")
    String taniTarih;
    @Column(name = "tani_resim")
    String taniResim;
    
    @ManyToOne()
    @JoinColumn(name = "tckimlik")
    Patient patient;
    @ManyToOne()
    @JoinColumn(name = "laborant_no")
    Laborant laborant;
}
