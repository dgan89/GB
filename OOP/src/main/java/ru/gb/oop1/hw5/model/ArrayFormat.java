package ru.gb.oop1.hw5.model;

import java.util.List;

public class ArrayFormat implements ImportInterface<List<String>>, ExportInterface<List<String>> {
    @Override
    public List<Contact> importData(List<String> data) {
        return data.stream()
                .map(e -> e.split("\\|"))
                .map(e -> {
                    Contact contact = new Contact();
                    contact.setName(e[0]);
                    contact.setPhone(e[1]);

                    return contact;
                })
                .toList();
    }

    @Override
    public List<String> exportData(List<Contact> data) {
        return data.stream()
                .map(e -> String.join("|", e.getName(), e.getPhone()))
                .toList();
    }
}
