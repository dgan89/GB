import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

/**
 * ДЗ 2
 */
public class Solution {
    /**
     * Сумма простых чисел
     *
     * @param values Последовательность чисел
     * @return Сумма
     */
    public int primeSum(int[] values) {
        BigInteger bigValue;
        int sum = 0;

        for (int value : values) {
            bigValue = BigInteger.valueOf(value);
            boolean probablePrime = bigValue.isProbablePrime((int) Math.log(value));

            if (probablePrime) {
                sum += value;
            }
        }

        return sum;
    }

    /**
     * Являеться возрастающей
     *
     * @param values Последовательность чисел
     * @return Результат
     */
    public boolean isSequences(int[] values) {
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] > values[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Замена отрицательных значений
     *
     * @param values Последовательность чисел
     * @return Результат
     */
    public Integer[] negativeReplace(Integer[] values) {
        List<Integer> list = Arrays.asList(values);

        int negativeIndexSum = list.stream()
                .filter(n -> n > 9 && n < 100)
                .mapToInt(list::indexOf)
                .reduce(0, Integer::sum);
        list.replaceAll(n -> n < 0 ? negativeIndexSum : n);

        return list.stream()
                .mapToInt(Integer::valueOf)
                .boxed()
                .toArray(Integer[]::new);
    }

    /**
     * Проверка валидности судоку
     *
     * @param chars Последовательность значений
     * @return Результат
     */
    public boolean isValidSudoku(char[][] chars) {
        Matrix board = new Matrix(chars);

        if (!isValidBoard(board)) {
            return false;
        }

        for (Matrix block : board.getBlocks()) {
            if (!isValidBlock(block)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Проверка блока судоку
     *
     * @param block Блок
     * @return Результат
     */
    private boolean isValidBlock(Matrix block) {
        char[] chars = block.getChars();

        return !this.hasDuplicate(chars);
    }

    /**
     * Проверка судоку по строкам и столбцам
     *
     * @param matrix Матрица
     * @return Результат
     */
    private boolean isValidBoard(Matrix matrix) {
        for (int i = 0; i < matrix.getLength(); i++) {
            char[] row = matrix.getRow(i);
            char[] col = matrix.getColumn(i);

            if (this.hasDuplicate(row) ||
                    this.hasDuplicate(col) ||
                    this.hasInvalidSymbols(row) ||
                    this.hasInvalidSymbols(col)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Проверка на дубликаты
     *
     * @param chars Последовательность значений
     * @return Результат
     */
    private boolean hasDuplicate(char[] chars) {
        Set<Character> items = new HashSet<>();

        return IntStream
                .range(0, chars.length)
                .filter(n -> chars[n] != '.')
                .filter(n -> !items.add(chars[n]))
                .count() > 0;
    }

    /**
     * Проверка на валидные символы
     *
     * @param chars Последовательность значений
     * @return Результат
     */
    private boolean hasInvalidSymbols(char[] chars) {
        return IntStream
                .range(0, chars.length)
                .filter(n -> chars[n] != '.')
                .filter(n -> "123456789".indexOf(chars[n]) < 0)
                .count() > 0;
    }
}
