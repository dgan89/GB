import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        primeSum(solution);
        isSequences(solution);
        negativeReplace(solution);
        validateSudoku(solution);
    }

    /**
     * Заменить отрицательные элементы на сумму индексов
     *
     * @param solution
     */
    private static void negativeReplace(Solution solution) {
        Integer[] values = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        Integer[] newValues = solution.negativeReplace(values);

        System.out.printf("Новая последовательность %s%n", Arrays.toString(newValues));
    }

    /**
     * Сумма простых чисел
     *
     * @param solution
     */
    private static void primeSum(Solution solution) {
        int[] values = {1, 3, 2, 4, 6, 11};
        int sum = solution.primeSum(values);

        System.out.printf("Сумма простых чисел %d%n", sum);
    }

    /**
     * Последовательность чисел
     *
     * @param solution
     */
    private static void isSequences(Solution solution) {
        int[] values = {1, 2, 3, 4, 6, 11};
        boolean isSequences = solution.isSequences(values);

        System.out.printf("Последовательность возрастающая %b%n", isSequences);
    }

    /**
     * Отвалидировать доску судоку
     *
     * @param solution
     */
    private static void validateSudoku(Solution solution) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        boolean isValid = solution.isValidSudoku(board);

        System.out.printf("Судоку валидный %b%n", isValid);
    }
}