package ru.gb.oop1.hw6;

import ru.gb.oop1.hw6.operations.*;
import java.util.List;

public class Calculator implements CalculatorInterface{
    @Override
    public double sum(List<? extends Number> numbers) {
        // TODO Принцип единственной ответственности класс делает только сложение
        return (new SumOperation()).execute(numbers);
    }

    @Override
    public double multiply(List<? extends Number> numbers) {
        // TODO Принцип единственной ответственности класс делает только умножение
        return (new MultiplyOperation()).execute(numbers);
    }

    @Override
    public double diff(List<? extends Number> numbers) {
        // TODO Принцип единственной ответственности класс делает только деление
        return (new DiffOperation()).execute(numbers);
    }

    @Override
    public String toBinary(Object value) {
        // TODO Принцип единственной ответственности класс только переводит в бинарное значение
        return (new BinaryOperation()).execute(value);
    }
}
