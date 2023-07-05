import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        searchNotebook(solution);
    }

    /**
     * Поиск ноутбука
     *
     * @param solution
     */
    private static void searchNotebook(Solution solution) {
        Scanner in = new Scanner(System.in);
        List<Notebook> items = Arrays.asList(
                new Notebook("M1", "HP", "red", "Windows", 1200, 2022),
                new Notebook("M2", "Xiaomi", "red", "Windows", 1000, 2023),
                new Notebook("M1", "Lenovo", "green", "Windows", 1000, 2023),
                new Notebook("M3", "HP", "white", "Linux", 900, 2021),
                new Notebook("M4", "Apple", "silver", "MacOS", 2000, 2020)
        );
        HashMap<Integer, String> search = new HashMap<>();

        System.out.println("Введите параметры поиска");
        System.out.println("0 - Искать, 1 - Модель, 2 - Брэнд, 3 - Цвет, 4 - ОС, 5 - Цена, 6 - Год");

        while (true) {
            System.out.print("Параметр: ");
            int num = in.nextInt();

            if (num == 0) {
                break;
            }

            System.out.print("Значение: ");
            String val = in.next();

            search.put(num, val.toLowerCase());
        }

        List<Notebook> result = solution.search(items, search);
        System.out.println(result);
    }
}