package ru.gb.oop1.hw7.service;

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
}
