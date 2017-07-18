package com.muzma.controller;

import com.muzma.dao.RekeningDao;
import com.muzma.entity.Rekening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RekeningController{
  @Autowired private RekeningDao rekeningDao;

  @RequestMapping("/rekening/")
  public Iterable<Rekening> semuaRekening(){
    return rekeningDao.findAll();
  }
}
