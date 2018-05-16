package com.demo.common.controller;

import com.demo.common.service.ProductCategoryService;
import com.jfinal.core.Controller;

public class ProductCategoryController extends Controller{

    private ProductCategoryService productCategoryService = ProductCategoryService.productCategoryService;
    
    public void getProductCategoryList() {
        renderJson(productCategoryService.getCategoryList());
    }

}
