package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(10,"Item");
        System.out.println("Befor: " + item.getLocalDateTime());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateFormat = item.getLocalDateTime().format(formatter);
        System.out.println("After: " + currentDateFormat);
    }
}