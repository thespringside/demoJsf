package com.theserverside.demoJsf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
    public String getfirstPage() {
        return "saluti.xhtml";
    }
    

}
