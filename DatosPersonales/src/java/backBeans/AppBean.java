/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backBeans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author fedva
 */
@Named(value = "appBean")
@ApplicationScoped
public class AppBean {

    /**
     * Creates a new instance of AppBean
     */
    public AppBean() {
    }
    
}
