package com.team.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String home(Model model) {
        model.addAttribute("data","타임리프 작동 확인");
        return "home"; 
    }
}
