package com.example.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "Manuel");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNextTime(Model model) {
        model.addAttribute("nickname", "Manny");
        return "goodbye";
    }
}