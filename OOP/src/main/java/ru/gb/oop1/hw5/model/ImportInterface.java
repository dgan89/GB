package ru.gb.oop1.hw5.model;

import java.util.List;

public interface ImportInterface<T> {
    List<Contact> importData(T data);
}
