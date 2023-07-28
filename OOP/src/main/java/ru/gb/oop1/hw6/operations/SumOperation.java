package ru.gb.oop1.hw6.operations;

import java.util.List;

public class SumOperation implements ComplexOperationInterface {
    //TODO Принцип подстановки Барбары Лисков реализован метод
    @Override
    public Double execute(List<? extends Number> numbers) {
        double result = 0.0;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }
}
