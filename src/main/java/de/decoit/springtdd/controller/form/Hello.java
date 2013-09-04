/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.decoit.springtdd.controller.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author britter
 */
public class Hello {
    
    @NotEmpty
    @Length(max=100)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
