package ru.gb.oop1.hw5.model;

public class Contact {
    private String name;
    private String phone;

    public static Contact instance(String name, String phone) {
        Contact instance = new Contact();
        instance.setName(name);
        instance.setPhone(phone);

        return instance;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() + " | Телефон: " + this.getPhone();
    }
}
