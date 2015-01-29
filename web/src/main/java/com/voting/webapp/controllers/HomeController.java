package com.voting.webapp.controllers;

/**
 * Home Controller
 * @since 0.1
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {

        ModelAndView model = new ModelAndView();
        model.setViewName("index");

        return model;

    }

}