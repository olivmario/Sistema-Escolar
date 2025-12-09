package com.example.demo;

import org.springframework.ui.Model; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class HomeController {

@GetMapping("/home") 
public String saudacao(Model model) {
    return "arquivoteste"; 
}

@GetMapping("/Login")
public String getMethodName(Model model) {
    return "login";
@PostMapping("/Salva")
    return "arquivoteste";

}

}