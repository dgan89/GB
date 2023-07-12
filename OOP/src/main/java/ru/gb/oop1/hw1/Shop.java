package ru.gb.oop1.hw1;

import java.util.Arrays;
import java.util.List;

public class Shop {
    private final List<Category> categories;

    public Shop(Category[] categories) {
        super();

        this.categories = Arrays.asList(categories);
    }

    public Product findProduct(int categoryId, int productId) {
        return categories
                .get(categoryId)
                .getProducts()
                .get(productId);
    }

    public void sellProduct(int categoryId, int productId) {
        categories
                .get(categoryId)
                .getProducts()
                .remove(productId);
    }
}
