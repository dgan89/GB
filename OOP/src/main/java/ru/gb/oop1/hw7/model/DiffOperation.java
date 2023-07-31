package ru.gb.oop1.hw7.model;

import java.util.List;

public class DiffOperation implements OperationInterface {
    @Override
    public Double execute(List<? extends Number> numbers) {
        double result = 0.0;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }

    @Override
    public String actionName() {
        return "Разность";
    }
}
