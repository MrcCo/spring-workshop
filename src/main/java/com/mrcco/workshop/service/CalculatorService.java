package com.mrcco.workshop.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public Integer sum(Integer firstNumber, Integer secondNumber) {

    return firstNumber + secondNumber;

  }

}
