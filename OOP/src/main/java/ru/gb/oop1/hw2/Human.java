package ru.gb.oop1.hw2;

public class Human implements Member {
    private static final int MAX_DISTANCE = 8;

    private static final int MAX_HEIGHT = 5;

    @Override
    public String name() {
        return "Человек";
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
