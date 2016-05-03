package com.pet.spring.security.hw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Simple controller for application initialization.
 *
 * @author Oleksandr Ivanov
 */
@Controller
public class SimpleController {

    @RequestMapping(value = {"/", "/welcome**"}, method = GET)
    public ModelAndView welcomePage() {
        ModelAndView result = new ModelAndView();
        result.setViewName("welcome");
        result.addObject("title", "Spring Security Pet Project");
        result.addObject("message", "This is welcome page!");
        return result;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Admin Page");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }

}
