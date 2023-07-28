package ru.gb.oop1.hw6.operations;

import java.util.List;

// TODO Принцип разделения интерфейсаю данный интерфейс работает только с комплексными числами
public interface ComplexOperationInterface extends OperationInterface<List<? extends Number>, Double> {
    Double execute(List<? extends Number> numbers);
}
