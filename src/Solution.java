import java.util.*;

public class Solution {
    public int[] revertList(int[] items) {
        int[] newItems = new int[5];
        int itemLength = items.length - 1;

        for (int i = itemLength; i >= 0; i--) {
            int index = itemLength - i;
            newItems[index] = items[i];
        }

        return newItems;
    }

    public Boolean isValidParentheses(String parentheses) {
        String oldParentheses = "";

        do {
            oldParentheses = parentheses;
            parentheses = parentheses.replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
        } while (!oldParentheses.equals(parentheses));

        return parentheses.isEmpty();
    }
}
