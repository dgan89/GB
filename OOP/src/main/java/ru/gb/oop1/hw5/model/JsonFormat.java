package ru.gb.oop1.hw5.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class JsonFormat implements ImportInterface<String>, ExportInterface<String> {
    @Override
    public List<Contact> importData(String data) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return Arrays.stream(mapper.readValue(data, Contact[].class)).toList();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String exportData(List<Contact> data) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
