package ru.gb.oop1.hw1;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Товар 1", 112.63, 5),
                new Product("Товар 2", 385.75, 3),
                new Product("Товар 3", 252.9, 4),
                new Product("Товар 4", 125.6, 5),
        };

        Category[] categories = {
                new Category("Категория 1", products),
                new Category("Категория 2", products),
                new Category("Категория 3", products),
        };

        Shop shop = new Shop(categories);

        User user1 = new User("Login", "Password");
        User user2 = new User("Login2", "Password2");

        displayCatalog(categories);
        buy(user1, shop, 1, 2);
        buy(user2, shop, 2, 3);
    }

    /**
     * Покупка товара
     *
     * @param user
     * @param categoryId
     * @param productId
     */
    private static void buy(User user, Shop shop, int categoryId, int productId) {
        Product product = shop.findProduct(categoryId, productId);

        user.addProduct(product);
        shop.sellProduct(categoryId, productId);

        System.out.println("Корзина товаров");

        for (Product item : user.getProducts()) {
            System.out.println(item.getName());
        }
    }

    /**
     * Вывод каталога
     *
     * @param categories
     */
    private static void displayCatalog(Category[] categories) {
        System.out.println("Каталог товаров");

        for (Category category : categories) {
            System.out.println(category.getName());

            for (Product product : category.getProducts()) {
                System.out.println(product.getName());
            }
        }
    }
}
