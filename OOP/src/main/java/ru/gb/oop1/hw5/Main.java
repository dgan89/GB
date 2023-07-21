package ru.gb.oop1.hw5;

import ru.gb.oop1.hw5.controller.Controller;
import ru.gb.oop1.hw5.model.Contact;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        String json = "[{\"name\":\"User 1\", " +
                "\"phone\":\"+790000000\"}," +
                " {\"name\":\"User 2\", " +
                "\"phone\":\"8900000011\"}]";
        controller.importJson(json);

        List<String> data = List.of("User 1|+790000000", "User 2|8900000011");
        controller.importArray(data);

        List<Contact> contacts = Arrays.asList(
                Contact.instance("User 1", "+790000000"),
                Contact.instance("User 2", "8900000011")
        );

        controller.exportToJson(contacts);
        controller.exportToArray(contacts);
    }
}
