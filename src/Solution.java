import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Notebook> search(List<Notebook> items, HashMap<Integer, String> search) {
        return items.stream()
                .filter(n -> search
                        .getOrDefault(1, n.getModel())
                        .equalsIgnoreCase(n.getModel()))
                .filter(n -> search
                        .getOrDefault(2, n.getBrand())
                        .equalsIgnoreCase(n.getBrand()))
                .filter(n -> search
                        .getOrDefault(3, n.getColor())
                        .equalsIgnoreCase(n.getColor()))
                .filter(n -> search
                        .getOrDefault(4, n.getPlatform())
                        .equalsIgnoreCase(n.getPlatform()))
                .filter(n -> n.getPrice() >= Integer.parseInt(search.getOrDefault(5, "0")))
                .filter(n -> n.getYear() >= Integer.parseInt(search.getOrDefault(6, "0")))
                .toList();
    }
}
