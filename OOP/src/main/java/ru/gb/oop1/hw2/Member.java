package ru.gb.oop1.hw2;

/**
 * Участник
 */
public interface Member {
    /**
     * Участник
     *
     * @return
     */
    public String name();

    /**
     * Может пробежать
     *
     * @param distance
     * @return
     */
    public Boolean couldRun(int distance);

    /**
     * Может перепрыгнуть
     *
     * @param height
     * @return
     */
    public Boolean couldJump(int height);
}
