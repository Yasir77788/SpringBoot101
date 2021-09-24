package com.example.SpringBoot_101.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String HomePage(Model model)
    {
        model.addAttribute("myVar", "This is coming from my model");
        return "index";
    }
}
