package ru.gb.oop1.hw7.model;


public class ConsoleLogger implements LoggerInterface {
    @Override
    public void addLog(String value) {
        System.out.println(value);
    }
}
