package ru.gb.oop1.hw5.model;

import java.util.List;

public interface ExportInterface<T> {
    T exportData(List<Contact> data);
}
