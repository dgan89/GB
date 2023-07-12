package ru.gb.oop1.hw1;

public class Product {
    private String name;

    private Double price;

    private Integer rating;

    public Product(String name, Double price, Integer rating) {
        super();

        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getRating() {
        return rating;
    }
}
