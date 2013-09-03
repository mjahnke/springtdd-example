/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.decoit.springtdd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Value("${farbe}") private String farbe;
    @Value("${wetter}") private String wetter;
    
    @RequestMapping(value="/index.html")
    public String printHello(final ModelMap map) {
        map.put("farbe", farbe);
        map.put("wetter", wetter);
        return "index";
    }
}