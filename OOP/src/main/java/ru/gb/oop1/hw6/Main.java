package ru.gb.oop1.hw6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        List<Number> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);

        console(calculator, numbers);
    }

    // TODO Принцип инверсии зависимостей. Метод зависет от абстракции
    private static void console(CalculatorInterface calculator, List<Number> numbers) {
        System.out.printf("Сумма %f\n", calculator.sum(new ArrayList<>(numbers)));
        System.out.printf("Произведение %f\n", calculator.multiply(new ArrayList<>(numbers)));
        System.out.printf("Разность %f\n", calculator.diff(new ArrayList<>(numbers)));
        System.out.printf("Бинароное значение Int %s\n", calculator.toBinary(12));
        System.out.printf("Бинароное значение Double %s\n", calculator.toBinary(12.0));
        System.out.printf("Бинароное значение String %s\n", calculator.toBinary("12.0"));
    }
}
