package ru.gb.oop1.hw5.service;

import ru.gb.oop1.hw5.model.*;

import java.util.List;

public class BaseService {
    public static <T> List<Contact> importData(Type type, T data) {
        ImportInterface format = switch (type) {
            case JSON -> new JsonFormat();
            case ARRAY -> new ArrayFormat();
        };

        return format.importData(data);
    }

    public static <T> T exportData(Type type, List<Contact> data) {
        ExportInterface format = switch (type) {
            case JSON -> new JsonFormat();
            case ARRAY -> new ArrayFormat();
        };

        return (T) format.exportData(data);
    }
}
