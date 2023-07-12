package ru.gb.oop1.hw1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }
}
