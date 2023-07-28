package ru.gb.oop1.hw6.operations;

public class BinaryOperation implements OperationInterface<Object, String> {
    //TODO Принцип подстановки Барбары Лисков реализован метод
    @Override
    public String execute(Object value) {
        double result = Double.parseDouble(value.toString());

        return Integer.toBinaryString((int) result);
    }
}
