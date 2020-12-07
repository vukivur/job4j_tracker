package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {

    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item item = new Item();
        Item itemTwo = new Item(5);
        Item itemThree = new Item(6, "Hello");
    }
}
