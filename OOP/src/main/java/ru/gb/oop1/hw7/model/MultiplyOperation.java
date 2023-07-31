package ru.gb.oop1.hw7.model;

import java.util.List;

public class MultiplyOperation implements OperationInterface {
    @Override
    public Double execute(List<? extends Number> numbers) {
        double result = numbers
                .remove(0)
                .doubleValue();

        for (Number number : numbers) {
            result *= number.doubleValue();
        }

        return result;
    }

    @Override
    public String actionName() {
        return "Умножение";
    }
}
