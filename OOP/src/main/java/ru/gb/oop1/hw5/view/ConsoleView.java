package ru.gb.oop1.hw5.view;

import java.util.List;


public class ConsoleView {
    public static void renderList(List<?> objectList) {
        for (Object o : objectList) {
            renderString(o.toString());
        }
    }

    public static void renderString(String value) {
        System.out.printf("%s\n", value);
    }
}
