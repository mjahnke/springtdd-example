/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.decoit.springtdd.controller;

import de.decoit.springtdd.controller.form.Hello;
import de.decoit.springtdd.controller.form.Login;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author marcel
 */
@Controller
public class LoginController {

    @Value("${loginName}")
    private String loginName;
    @Value("${password}")
    private String password;

    @RequestMapping(value = "login.html", method = RequestMethod.GET)
    public String login(final ModelMap map) {
        Login login = new Login();
        map.put("login", login);
        return "login";
    }

    @RequestMapping(value = "login.html", method = RequestMethod.POST)
    public ModelAndView helloFormSubmit(@Valid @ModelAttribute("login") Login loginCmd, final BindingResult result, final ModelMap map) {
        if (result.hasErrors()) {
            return new ModelAndView("login");
        }

        if (loginCmd.getLoginName().equals(loginName) && loginCmd.getPassword().equals(password)) {
            map.put("loginName", loginCmd.getLoginName());
            map.put("password", loginCmd.getPassword());
            return new ModelAndView("successLogin", map);
        }

        map.put("loginName", "Leider Falsch");
        map.put("password", "Leider Falsch");
        return new ModelAndView("failureLogin", map);
    }
}
