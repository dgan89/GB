
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public double searchProductMaxPrice(List<Product> products) {
        return products.stream()
                .filter(p -> p.getClassification() <= 2)
                .filter(p -> p.getTitle().indexOf("высший") > 0)
                .mapToDouble(Product::getPrice)
                .max()
                .orElse(0.0);
    }

    public String searchProductName(List<Product> products, int classification) {
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);

        return products.stream()
                .filter(p -> p.getClassification() == classification)
                .min(comparator)
                .get()
                .getTitle();
    }

    public List<String> searchBookName(List<Book> books) {
        return books.stream()
                .filter(b -> BigInteger
                        .valueOf(b.getPages())
                        .isProbablePrime((int) Math.log(b.getPages()))
                )
                .filter(b -> b.getYear() >= 2010)
                .filter(b -> b.getAuthor().indexOf("а") > 0)
                .map(Book::getTitle)
                .toList();
    }

    public List<Integer> minMaxAvg(List<Integer> items) {
        List<Integer> prepared = new ArrayList<>();

        Integer maxNumber = items
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getMax();
        Integer minNumber = items
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getMin();
        double avgNumber = items
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();

        prepared.add(maxNumber);
        prepared.add(minNumber);
        prepared.add((int) avgNumber);

        return prepared;
    }

    public List<Integer[]> getCombinetList(List<Integer> items) {
        Collections.sort(items);
        List<Integer[]> prepared = new ArrayList<>(this.mutateList(items));

        Collections.swap(items, 0, 1);
        prepared.addAll(this.mutateList(items));

        Collections.swap(items, 2, 1);
        prepared.addAll(this.mutateList(items));

        return prepared;
    }

    private List<Integer[]> mutateList(List<Integer> items) {
        List<Integer[]> prepared = new ArrayList<>();
        prepared.add(items.toArray(new Integer[0]));

        Collections.reverse(items);
        prepared.add(items.toArray(new Integer[0]));

        Collections.sort(items);

        return prepared;
    }
}
