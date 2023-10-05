package com.cp.marketbooking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    private String indexPage(){
        return "index";
    }
    @GetMapping("/zone_detail")
    private String Zone(){
        return "Zone_detail";
    }
}
