package com.demo.common;


import com.demo.common.controller.HelloController;
import com.demo.common.controller.ProductCategoryController;
import com.demo.common.controller.ProductController;
import com.demo.common.model._MappingKit;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

public class CommonConfig extends JFinalConfig {
    
    @Override
    public void configConstant(Constants me) {
        PropKit.use("config.properties");
        me.setDevMode(PropKit.getBoolean("devMode"));
    }

    public void configRoute(Routes me) {
        /*me.add("/user", UserController.class);*/
        me.add("/hello", HelloController.class);
        me.add("/product", ProductController.class);
        me.add("/productCategory", ProductCategoryController.class);
    }

    public void configEngine(Engine me) {
    }

    public void configPlugin(Plugins me) {
     // 配置C3p0数据库连接池插件
        DruidPlugin druidPlugin = createDruidPlugin();
        me.add(druidPlugin);
        
        // 配置ActiveRecord插件
        ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
        // 所有映射在 MappingKit 中自动化搞定
        _MappingKit.mapping(arp);
        me.add(arp);
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }
    
    public static DruidPlugin createDruidPlugin() {
        return new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
    }
    
    

    public static void main(String[] args) {
        JFinal.start("WebRoot", 80, "/", 5);
    }
}
