package ru.gb.oop1.hw6.operations;

import java.util.List;

public interface OperationInterface<T, S> {
    // TODO Принцип открытости-закрытости каждый наследник должен реализовать метод
    S execute(T numbers);
}
