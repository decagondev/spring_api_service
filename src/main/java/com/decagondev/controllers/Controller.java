package com.decagondev.controllers;

import com.decagondev.entities.Result;
import com.decagondev.services.AluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private AluService aluService;

    @PostMapping("/")
    public Result getCalculation(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
        return aluService.calculate(a, b);
    }
}
