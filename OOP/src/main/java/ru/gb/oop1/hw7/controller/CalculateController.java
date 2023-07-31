package ru.gb.oop1.hw7.controller;

import ru.gb.oop1.hw7.model.ConsoleLogger;
import ru.gb.oop1.hw7.service.Calculator;
import ru.gb.oop1.hw7.service.CalculatorInterface;

import java.util.ArrayList;
import java.util.List;

public class CalculateController {
    private final CalculatorInterface calculator = new Calculator(new ConsoleLogger());

    public void run(List<Number> numbers) {
        this.calculator.sum(new ArrayList<>(numbers));
        this.calculator.multiply(new ArrayList<>(numbers));
        this.calculator.diff(new ArrayList<>(numbers));
    }
}
