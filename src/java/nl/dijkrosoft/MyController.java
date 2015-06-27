/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft;

import java.util.Date;
import java.util.ResourceBundle;
import javax.enterprise.inject.Model;

/**
 *
 * @author dickdijk
 */
@Model
public class MyController {

    public void clearCache() {
        ResourceBundle.clearCache();
        System.out.println("clear cache" + new Date());
    }
}
