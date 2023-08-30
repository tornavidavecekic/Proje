/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proje.repository;

import java.awt.print.Pageable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author canca
 */

public interface HastaRepository extends JpaRepository <Hasta, Integer>{
    public List<Hasta> findAll(Pageable pageable);
}
