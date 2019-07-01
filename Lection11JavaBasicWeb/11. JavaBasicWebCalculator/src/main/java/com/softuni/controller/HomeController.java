package com.softuni.controller;

import com.softuni.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }

    @PostMapping("/")
    public String calculate(@RequestParam String leftOperand,
                            @RequestParam String operator,
                            @RequestParam String rightOperand,
                            Model model) {

        double num1;
        double num2;

        try {
            num1 = Double.parseDouble(leftOperand);
        } catch (NumberFormatException ex) {
            model.addAttribute("leftOperand", leftOperand);
            model.addAttribute("rightOperand", rightOperand);
            model.addAttribute("operator", operator);
            model.addAttribute("result", "Illegal left operand");
            model.addAttribute("view", "views/calculatorForm");
            return "base-layout";
        }

        try {
            num2 = Double.parseDouble(rightOperand);
        } catch (NumberFormatException ex) {
            model.addAttribute("leftOperand", leftOperand);
            model.addAttribute("rightOperand", rightOperand);
            model.addAttribute("operator", operator);
            model.addAttribute("result", "Illegal right operand");
            model.addAttribute("view", "views/calculatorForm");
            return "base-layout";
        }

        Calculator calculator = new Calculator(num1, num2, operator);
        double result = calculator.calculateResult();
        DecimalFormat formatter = new DecimalFormat("#.##");

        model.addAttribute("leftOperand", formatter.format(calculator.getLeftOperand()));
        model.addAttribute("rightOperand", formatter.format(calculator.getRightOperand()));
        model.addAttribute("operator", calculator.getOperator());
        if (calculator.getRightOperand() == 0 && calculator.getOperator().equals("/")) {
            model.addAttribute("result", "Devision by 0 is not allowed");
        } else {
            model.addAttribute("result", formatter.format(result));
        }


        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }
}
