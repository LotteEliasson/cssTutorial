package com.example.csstutorial.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/treeboxes")
    public String treeboxes(){
        return "treeboxes";
    }

    @GetMapping("/scroll")
    public String scroll(){
        return "scroll";
    }
}
