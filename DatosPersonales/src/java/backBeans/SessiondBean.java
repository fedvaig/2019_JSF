/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backBeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author fedva
 */
@Named(value = "sessiondBean")
@SessionScoped
public class SessiondBean implements Serializable {

    /**
     * Creates a new instance of SessiondBean
     */
    public SessiondBean() {
    }
    
}
