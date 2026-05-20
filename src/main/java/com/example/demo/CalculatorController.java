package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    private final Calculator calculator;
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("result", calculator.add(a, b));

        return "index";
    }
}
