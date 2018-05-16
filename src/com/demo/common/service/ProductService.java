package com.demo.common.service;

import java.util.List;

import com.demo.common.model.Product;
import com.jfinal.aop.Enhancer;

public class ProductService {
    
    public static final ProductService productService = Enhancer.enhance(ProductService.class);
    
    private final Product productDao = new Product();
    
    public List<Product> getAllProductList() {
       return productDao.find(" select * from product ");
    }
    
    public Product getProductInfo(Integer id) {
        return productDao.findById(id);
    }
    
    public List<Product> getProductListByCategoryId(Integer id) {
        return productDao.find(" select * from product where category_id = " + id);
    }
}
