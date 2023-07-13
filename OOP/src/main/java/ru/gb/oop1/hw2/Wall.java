package ru.gb.oop1.hw2;

/**
 * Стена
 */
public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        super();
        this.height = height;
    }

    @Override
    public String actionName() {
        return "Стена";
    }

    @Override
    public Boolean execute(Member member) {
        return member.couldJump(this.height);
    }
}
