package com.demo.common.service;

import java.util.List;

import com.demo.common.model.ProductCategory;
import com.jfinal.aop.Enhancer;

public class ProductCategoryService {

    public static final ProductCategoryService productCategoryService = Enhancer.enhance(ProductCategoryService.class);

    private final ProductCategory              categoryDao     = new ProductCategory();
    
    public List<ProductCategory> getCategoryList() {
        return categoryDao.find(" select * from product_category ");
    }
}
