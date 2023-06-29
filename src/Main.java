import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        revertList(solution);
        checkIsValidParentheses(solution);
    }

    /**
     * Провепрка валидности строки
     *
     * @param solution
     */
    private static void checkIsValidParentheses(Solution solution) {
        String parentheses = "([])[{}]{[{}]}";
        boolean isValid = solution.isValidParentheses(parentheses);

        System.out.printf("Строка валидна %b", isValid);
    }

    /**
     * Вывод массива в обратном порядке
     *
     * @param solution
     */
    private static void revertList(Solution solution) {
        int[] items = {1, 2, 3, 4, 5,};
        int[] newItems = solution.revertList(items);

        System.out.printf("Результат %s", Arrays.toString(newItems));
    }
}