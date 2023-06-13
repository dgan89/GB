import java.util.*;

public class Solution {
    /**
     * Преобразование строки в обратном порядке
     *
     * @param s Строка для обработки
     * @return Строка в обратном порядке
     */
    public String reverseWords(String s) {
        String[] list = this.prepareString(s);
        Collections.reverse(Arrays.asList(list));

        return String.join(" ", list);
    }

    /**
     * Сумма последовательности чисел
     *
     * @param sequence Последовательность чисел
     * @return Сумма чисел
     */
    public Integer sequenceSum(Integer[] sequence) {
        int sum = 0, currentVal, prevVal;
        List<Integer> items = Arrays.asList(sequence);
        ListIterator<Integer> iterator = items.listIterator();
        iterator.next();

        do {
            currentVal = items.get(iterator.nextIndex());
            prevVal = items.get(iterator.previousIndex());

            if (currentVal < 0 && prevVal > 0) {
                sum += prevVal;
            }

            iterator.next();
        } while (iterator.hasNext() || currentVal != 0);

        return sum;
    }

    /**
     * Обработка строки
     *
     * @param s Строка для обработки
     * @return Список слов в строке
     */
    private String[] prepareString(String s) {
        return s
                .trim()
                .replaceAll("\\s{2,}", " ")
                .split(" ");
    }
}
