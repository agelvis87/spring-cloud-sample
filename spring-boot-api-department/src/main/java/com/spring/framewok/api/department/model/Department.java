package com.spring.framewok.api.department.model;

import java.util.List;
import com.spring.framewok.api.department.client.model.Product;
import lombok.Data;

@Data
public class Department {

  private int id;

  private String name;
  
  private String description;

  private List<Product> products;

}
