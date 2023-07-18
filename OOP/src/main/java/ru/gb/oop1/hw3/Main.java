package ru.gb.oop1.hw3;

import ru.gb.oop1.hw1.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame game = new LetterGame();
        Scanner scanner = new Scanner(System.in);

        game.start(scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();

        start(scanner, game);
        logs(game);

        scanner.close();
    }

    /**
     * @param game
     */
    public static void logs(AbstractGame game) {
        System.out.println("Логи");

        for (String log : game.logs()) {
            System.out.println(log);
        }
    }

    /**
     * @param scanner
     * @param game
     */
    public static void start(Scanner scanner, AbstractGame game) {
        while (!game.getGameStatus().equals(GameStatus.FINISH)) {
            String value = scanner.nextLine();
            Answer answer = game.inputValue(value);

            if (answer != null) {
                System.out.println("answer = " + answer);
            } else {
                System.out.println("Перезапустить [y/n]");

                if (scanner.next().equals("y")) {
                    scanner.nextLine();
                    game.restart();

                    start(scanner, game);
                }
            }
        }
    }
}
