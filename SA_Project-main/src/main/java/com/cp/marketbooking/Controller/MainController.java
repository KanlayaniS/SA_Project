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
    @GetMapping("/kice_detail")
    private String zoneDetail(){
        return "Kice";
    }

    @GetMapping("/search")
    private String searchArea(){
        return "search";
    }
    @GetMapping("/reserve_page")
    private String reserveArea(){
        return "reserve";
    }

    @GetMapping("/area_detail")
    private String Area_Detail(){
        return "area_detail";
    }

    

}
