import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int searchCount(String income, String search) {
        HashMap<String, Integer> map = new HashMap<>();

        search = search.toLowerCase();
        income = income.toLowerCase();
        income = income.replaceAll("[.—]", "");

        for (String word : income.split("\\s")) {
            Integer count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }

        return map.getOrDefault(search, 0);
    }

    public List<String> searchDuplicates(List<String> items) {
        HashMap<String, Integer> map = (HashMap<String, Integer>) items.stream()
                .map(e -> e.split("\\s"))
                .map(e -> e[0].toLowerCase())
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

        return map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey() + " " + e.getValue())
                .collect(Collectors.toList());
    }
}
