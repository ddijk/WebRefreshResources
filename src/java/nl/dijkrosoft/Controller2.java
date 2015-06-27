/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft;

import static com.sun.faces.spi.ConfigurationResourceProviderFactory.ProviderType.FacesConfig;
import java.util.Date;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author dickdijk
 */
@ManagedBean
public class Controller2 {

    ClassLoader cl;

    @PostConstruct
    public void init() {
        System.out.println("creating controller");
        cl = this.getClass().getClassLoader();
        System.out.println("classloader:" + cl);
    }

    public void clearCache() {
        ResourceBundle.clearCache(cl);
        ResourceBundle.clearCache(Thread.currentThread().getContextClassLoader());

        ResourceBundle.clearCache(FacesConfig.getClass().getClassLoader());
     //   ResourceBundle.clearCache()

        System.out.println("clear cache" + new Date());
    }
}
