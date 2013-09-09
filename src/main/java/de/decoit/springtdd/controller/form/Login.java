/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.decoit.springtdd.controller.form;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author marcel
 */
public class Login {
    
    @NotEmpty
    private String loginName;
    @NotEmpty
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
