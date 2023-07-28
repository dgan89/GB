package ru.gb.oop1.hw6;

import java.util.List;

public interface CalculatorInterface {
    /**
     * @param numbers
     * @return
     */
    public double sum(List<? extends Number> numbers);

    /**
     * Умножение
     *
     * @param numbers
     * @return
     */
    public double multiply(List<? extends Number> numbers);

    /**
     * Разность
     *
     * @param numbers
     * @return
     */
    public double diff(List<? extends Number> numbers);

    /**
     * Бинарное значение
     *
     * @param value
     * @return
     */
    public String toBinary(Object value);
}
