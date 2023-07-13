package ru.gb.oop1.hw2;

public class Cat implements Member {
    private static final int MAX_DISTANCE = 5;

    private static final int MAX_HEIGHT = 7;

    @Override
    public String name() {
        return "Кот";
    }

    @Override
    public Boolean couldRun(int distance) {
        return distance <= MAX_DISTANCE;
    }

    @Override
    public Boolean couldJump(int height) {
        return height <= MAX_HEIGHT;
    }
}
