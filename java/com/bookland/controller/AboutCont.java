package com.bookland.controller;

import com.bookland.controller.main.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutCont extends Main {
    @GetMapping
    public String about(Model model) {
        AddAttributes(model);
        return "about";
    }
}
