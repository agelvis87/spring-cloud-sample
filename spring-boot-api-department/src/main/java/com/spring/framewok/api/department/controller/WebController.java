package com.spring.framewok.api.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.framewok.api.department.client.ProductClient;
import com.spring.framewok.api.department.model.Department;

@RestController 
public class WebController {

  @Autowired
  private ProductClient productClient;

  @GetMapping(path = "/department", produces = "application/json")
  public Department getProducts() {

    Department output = new Department();

    output.setId(1);
    output.setName("Departamento 1");
    output.setName("Descripcion Departamento 1");
    output.setProducts(productClient.getProdcuts());

    return output;
  }

}
