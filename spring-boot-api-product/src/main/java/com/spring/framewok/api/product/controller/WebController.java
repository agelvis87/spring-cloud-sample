package com.spring.framewok.api.product.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.framewok.api.product.model.Product;

@RestController
public class WebController {

  @GetMapping(path = "/products", produces = "application/json")
  public List<Product> getProducts() {

    return buildProducts();
  }

  // ----------------
  // Metodos privados
  // ----------------

  private List<Product> buildProducts() {

    List<Product> output = new ArrayList<>();

    Product item = null;

    for (int i = 1; i < 5; i++) {

      item = new Product();
      item.setId(i);
      item.setName("Producto " + i);
      item.setDescription("Descripcion Producto " + i);

      output.add(item);
    }

    return output;
  }

}
