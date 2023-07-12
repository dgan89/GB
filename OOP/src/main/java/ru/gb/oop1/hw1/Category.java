package ru.gb.oop1.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Category {
    private final String name;

    private final List<Product> products;

    public Category(String name, Product[] products) {
        super();

        this.name = name;
        this.products = new ArrayList<>(Arrays.asList(products));
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
