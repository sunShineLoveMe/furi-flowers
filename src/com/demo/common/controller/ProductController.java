package com.demo.common.controller;

import com.demo.common.service.ProductService;
import com.jfinal.core.Controller;

public class ProductController extends Controller{
    
    private ProductService productService = ProductService.productService;
    
    public void index() {
        renderText("Hello productService");
    }
    
    
    public void getProductList() {
        renderJson(productService.getAllProductList());
    }
    
    /**
     * 
     * getProductInfo:(根据id查询产品详情). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
     * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author qijy  
     * @since JDK 1.7
     */
    public void getProductInfo() {
        String id = getPara("id");
        renderJson(productService.getProductInfo(new Integer(id)));
    }
    
    /**
     * 
     * getProductListByCategoryId:(根据种类id查询产品list). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
     * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author qijy  
     * @since JDK 1.7
     */
    public void getProductListByCategoryId() {
        String categoryId = getPara("categoryId");
        renderJson(productService.getProductListByCategoryId(new Integer(categoryId)));
    }
    
    
}
