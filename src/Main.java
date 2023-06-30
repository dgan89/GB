import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        searchWord(solution);
        searchDuplicates(solution);
    }

    /**
     * Поиск дубликатов
     *
     * @param solution
     */
    private static void searchDuplicates(Solution solution) {
        List<String> items = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Ежов"
        );
        List<String> result = solution.searchDuplicates(items);
        System.out.println(result);
    }

    /**
     * Поиск колличества лов в строке
     *
     * @param solution
     */
    private static void searchWord(Solution solution) {
        String income = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String search = "Россия";

        Integer count = solution.searchCount(income, search);
        System.out.printf("%s - %d", search, count);
    }
}