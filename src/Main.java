// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        reverseWords();
        sequenceSum();
    }

    /**
     * Преобразование строки в обратном порядке
     */
    private static void reverseWords() {
        String inputValue = "a good   example";

        Solution solution = new Solution();
        String result = solution.reverseWords(inputValue);

        System.out.println(result);
    }

    /**
     * Сумма последовательности чисел
     */
    private static void sequenceSum() {
        Integer[] inputValue = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};

        Solution solution = new Solution();
        int result = solution.sequenceSum(inputValue);

        System.out.println(result);
    }
}