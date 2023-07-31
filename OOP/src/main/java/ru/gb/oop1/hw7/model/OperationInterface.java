package ru.gb.oop1.hw7.model;

import java.util.List;

public interface OperationInterface {
    Double execute(List<? extends Number> numbers);

    String actionName();
}
