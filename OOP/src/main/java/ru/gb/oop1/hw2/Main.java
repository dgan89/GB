package ru.gb.oop1.hw2;

public class Main {
    public static void main(String[] args) {
        Member[] members = {
                new Cat(),
                new Robot(),
                new Human(),
        };

        Obstacle[] distance = {
                new Treadmill(2),
                new Wall(3),
                new Treadmill(5),
                new Wall(6),
                new Treadmill(7),
                new Wall(5),
        };

        runDistance(members, distance);
    }

    /**
     * Пробежать дистанцию
     *
     * @param members
     * @param distance
     */
    private static void runDistance(Member[] members, Obstacle[] distance) {
        for (Member member : members) {
            System.out.println(member.name());

            for (Obstacle obstacle : distance) {
                Boolean isExecuted = obstacle.execute(member);
                System.out.printf("%s - %b%n", obstacle.actionName(), isExecuted);

                if (!isExecuted) {
                    break;
                }
            }
        }
    }
}
