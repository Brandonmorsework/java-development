package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

private List<Product> products;

public ProductsController() {
    this.products = new ArrayList<>();

    products.add(new Product(1, "Apple", 1212, 2.59));
    products.add(new Product(2, "Orange", 3434, 1.99));
    products.add(new Product(3, "Potato", 5656, 3.29));
}

@RequestMapping(path = "/products", method = RequestMethod.GET)
public List<Product> getAllProducts() {
    return products;
}

@RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public  Product getProductById(@PathVariable int productId) {
    for (Product product : products) {
        if (product.getProductId() == productId) {
            return product;
        }
    }
    return null;
}
}
