package ru.gb.oop1.hw3;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private final List<String> logs = new ArrayList<>();

    public void addLog(String value) {
        logs.add(value);
    }

    public List<String> logs() {
        return logs;
    }
}
