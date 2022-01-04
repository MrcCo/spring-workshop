package com.mrcco.workshop.controller;

import com.mrcco.workshop.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/calculator")
public class CalculatorController {

  private final CalculatorService calculatorService;

  @Autowired
  public CalculatorController(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  @GetMapping("/sum/{firstNumber}/{secondNumber}")
  public Integer sum(@PathVariable(name = "firstNumber") Integer firstNumber,
                     @PathVariable(name = "secondNumber") Integer secondNumber) {

    return calculatorService.sum(firstNumber, secondNumber);
  }

}
