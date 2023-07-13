package ru.gb.oop1.hw2;

public class Robot implements Member {
    private static final int MAX_DISTANCE = 3;

    private static final int MAX_HEIGHT = 2;

    @Override
    public String name() {
        return "Робот";
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
