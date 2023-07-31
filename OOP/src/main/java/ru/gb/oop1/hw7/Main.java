package ru.gb.oop1.hw7;

import ru.gb.oop1.hw7.controller.CalculateController;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);

        CalculateController controller = new CalculateController();
        controller.run(numbers);
    }
}
