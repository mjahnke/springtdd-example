/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.decoit.springtdd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value="/index.html")
    public String printHello(final ModelMap map) {
        map.put("farbe", "grün");
        map.put("wetter", "sonnig");
        return "index";
    }
}