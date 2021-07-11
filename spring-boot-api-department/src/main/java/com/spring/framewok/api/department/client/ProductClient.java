package com.spring.framewok.api.department.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.framewok.api.department.client.model.Product;

@FeignClient(name = "spring-boot-api-product")
public interface ProductClient {

  /**
   * 
   */
  @RequestMapping(method = RequestMethod.GET, value = "/products", produces = "application/json")
  List<Product> getProdcuts();

}
