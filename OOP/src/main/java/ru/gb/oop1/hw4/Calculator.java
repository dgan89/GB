package ru.gb.oop1.hw4;

import java.util.List;

public class Calculator {
    /**
     * Сложение
     *
     * @param numbers
     * @return
     */
    public double sum(List<? extends Number> numbers) {
        double result = 0.0;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }

    /**
     * Умножение
     *
     * @param numbers
     * @return
     */
    public double multiply(List<? extends Number> numbers) {
        double result = numbers
                .remove(0)
                .doubleValue();

        for (Number number : numbers) {
            result *= number.doubleValue();
        }

        return result;
    }

    /**
     * Разность
     *
     * @param numbers
     * @return
     */
    public double diff(List<? extends Number> numbers) {
        double result = numbers
                .remove(0)
                .doubleValue();

        for (Number number : numbers) {
            result /= number.doubleValue();
        }

        return result;
    }

    /**
     * Бинарное значение
     *
     * @param value
     * @return
     */
    public String toBinary(Object value) {
        double result = Double.parseDouble(value.toString());

        return Integer.toBinaryString((int) result);
    }
}
