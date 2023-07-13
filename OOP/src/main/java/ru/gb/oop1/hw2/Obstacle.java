package ru.gb.oop1.hw2;

/**
 * Препятствие
 */
public interface Obstacle {
    /**
     * Напзвание действия
     *
     * @return
     */
    public String actionName();

    /**
     * Преодолеть дистанцию
     *
     * @param member
     * @return
     */
    public Boolean execute(Member member);
}
