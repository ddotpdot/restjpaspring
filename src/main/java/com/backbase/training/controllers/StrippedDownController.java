package com.backbase.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by deepak on 05/11/14.
 */

@Controller
public class StrippedDownController {

    @RequestMapping(value="/")
    public ModelAndView randomMethod()
    {
        ModelAndView mav= new ModelAndView("index");

String message ="Inside random method";
        mav.addObject("msg",message);
        return mav;

    }


}



