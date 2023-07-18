package ru.gb.oop1.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LetterGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        Random random = new Random();

        char[] characters = "abcdefghijklmnopqrstuvwxyzабвгдежзиклмнопрстуфхцчшщъыьэюя".toCharArray();
        int charLength = characters.length;
        List<String> result = new ArrayList<>();

        for (int i = 0; i <= sizeWord; i++) {
            char letter = characters[random.nextInt(charLength)];
            result.add(String.valueOf(letter));
        }

        return result;
    }
}
