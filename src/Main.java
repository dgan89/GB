import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Товар 1", "Россия", 2, 1000, 1),
                new Product("Товар 2 высший", "Китай", 3, 500, 6),
                new Product("Товар 3 высший", "Сингапур", 1, 300, 1),
                new Product("Товар 4", "Россия", 2.2, 100, 2),
                new Product("Товар 5 высший", "США", 4, 900, 2)
        );
        Solution solution = new Solution();

        searchMaxPrice(solution, products);
        searchProductName(solution, products, 2);
        searchBookName(solution);
        searchMinMaxAvg(solution);
        combineList(solution);
    }

    /**
     * Варианты массива
     *
     * @param solution
     */
    private static void combineList(Solution solution) {
        List<Integer> items = Arrays.asList(1, 2, 3);

        List<Integer[]> prepared = solution.getCombinetList(items);
        System.out.printf("Варианты массива %s", Arrays.deepToString(prepared.toArray()));

    }

    /**
     * Поиск минимально, максимально и среднего значений
     *
     * @param solution
     */
    private static void searchMinMaxAvg(Solution solution) {
        List<Integer> items = Arrays.asList(1, 22, 33, 44, 5, -5, -3, 23, -7);

        List<Integer> prepared = solution.minMaxAvg(items);
        System.out.printf("Мин, Макс, Среднее %s", prepared);
    }

    /**
     * Поиск книг
     *
     * @param solution
     */
    private static void searchBookName(Solution solution) {
        List<Book> books = Arrays.asList(
                new Book("Кника 1", "Пушкий", 500, 2010, 500),
                new Book("Кника 2", "Толстой", 300, 2011, 300),
                new Book("Кника 3", "Лермонтов", 10, 1999, 55),
                new Book("Кника 4", "Достоевский", 450, 2007, 260),
                new Book("Кника 5", "Булгаков", 200, 2020, 67)
        );

        List<String> titles = solution.searchBookName(books);
        System.out.printf("Книги %s", titles);
    }

    /**
     * Поиск названия товара по сорту
     *
     * @param solution
     * @param products
     * @param classification
     */
    private static void searchProductName(
            Solution solution,
            List<Product> products,
            int classification
    ) {
        String title = solution.searchProductName(products, classification);
        System.out.printf("Товар с наименьшей стоимость %s", title);
    }

    /**
     * Поиск максимальной суммы товара
     *
     * @param solution
     * @param products
     */
    private static void searchMaxPrice(Solution solution, List<Product> products) {

        double maxPrice = solution.searchProductMaxPrice(products);
        System.out.printf("Максимальная цена товара %f", maxPrice);
    }
}