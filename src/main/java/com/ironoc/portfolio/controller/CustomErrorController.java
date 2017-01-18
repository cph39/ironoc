package com.ironoc.portfolio.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomErrorController implements ErrorController {

	private static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ModelAndView error(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
    	LOGGER.info(httpServletRequest.getRequestURI() + " page request");
        return new ModelAndView("index");
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
