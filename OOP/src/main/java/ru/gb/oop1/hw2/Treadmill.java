package ru.gb.oop1.hw2;

/**
 * Беговая дорожка
 */
public class Treadmill implements Obstacle {
    private final int distance;

    public Treadmill(int distance) {
        super();
        this.distance = distance;
    }

    @Override
    public String actionName() {
        return "Беговая дорожка";
    }

    @Override
    public Boolean execute(Member member) {
        return member.couldRun(this.distance);
    }
}
