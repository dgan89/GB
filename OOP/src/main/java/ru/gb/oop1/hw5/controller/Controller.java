package ru.gb.oop1.hw5.controller;

import ru.gb.oop1.hw5.model.Contact;
import ru.gb.oop1.hw5.model.Type;
import ru.gb.oop1.hw5.service.BaseService;
import ru.gb.oop1.hw5.view.ConsoleView;

import java.util.List;

public class Controller {
    /**
     * Импорт из json
     *
     * @param data json-строка
     */
    public void importJson(String data) {
        List<Contact> contacts = BaseService.importData(Type.JSON, data);
        ConsoleView.renderList(contacts);
    }

    /**
     * Импорт из json
     *
     * @param data массив данных
     */
    public void importArray(List<String> data) {
        List<Contact> contacts = BaseService.importData(Type.ARRAY, data);
        ConsoleView.renderList(contacts);
    }

    /**
     * Экспорт в массив
     *
     * @param data
     */
    public void exportToJson(List<Contact> data) {
        String json = BaseService.exportData(Type.JSON, data);
        ConsoleView.renderString(json);
    }

    /**
     * Экспорт в json
     *
     * @param data
     */
    public void exportToArray(List<Contact> data) {
        List<String> values = BaseService.exportData(Type.ARRAY, data);
        ConsoleView.renderList(values);
    }
}
