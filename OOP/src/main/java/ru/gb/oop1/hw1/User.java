package ru.gb.oop1.hw1;

import java.util.List;

public class User {
    private final String login;

    private final String password;

    private final Basket basket = new Basket();

    public User(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void addProduct(Product product) {
        basket.getProducts().add(product);
    }

    public List<Product> getProducts() {
        return basket.getProducts();
    }
}
