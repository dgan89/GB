package ru.gb.oop1.hw3;

public interface Game {
    void start(Integer sizeWord,Integer maxTry);

    void restart();

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
