/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proje.mapper;

import org.modelmapper.ModelMapper;

/**
 *
 * @author canca
 */
public interface ModelMapperService {
    public ModelMapper forResponse();
    public ModelMapper forRequest();
}
