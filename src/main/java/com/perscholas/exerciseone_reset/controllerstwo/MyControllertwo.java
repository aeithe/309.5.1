package com.perscholas.exerciseone_reset.controllerstwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllertwo {
    @GetMapping({"login"})
    public String showIndex(){
        return "index";
    }
}
