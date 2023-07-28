package ru.gb.oop1.hw6.operations;

import java.util.List;

public class MultiplyOperation implements ComplexOperationInterface {
    //TODO Принцип подстановки Барбары Лисков реализован метод
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
}
