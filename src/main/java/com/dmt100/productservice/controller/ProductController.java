package com.dmt100.productservice.controller;

import com.dmt100.productservice.dto.ProductRequest;
import com.dmt100.productservice.dto.ProductResponse;
import com.dmt100.productservice.model.Product;
import com.dmt100.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();

    }

//    @GetMapping("/id")
//    public Product getProduct(@PathVariable int id) {
//        return productService.getProductById(id);
//    }


}