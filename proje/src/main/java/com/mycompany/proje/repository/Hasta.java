/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author canca
 */
@Table(name = "hasta")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hasta {
    @Id
    @Column(name = "tckimlik")
    int tcKimlik;
    @Column(name = "dosya_no")
    int dosyaNo;
    @Column(name = "ad")
    String name;
    @Column(name = "soyad")
    String surname;
    
    @OneToMany(mappedBy = "tckimlik")
    List<Rapor> rapor;
}
