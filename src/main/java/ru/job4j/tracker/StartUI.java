package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item: " + name + " - was created.");
            } else if (select == 1) {
                System.out.println("All Items: ");
                Item[] result = tracker.findAll();
                for (Item item : result) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("Edit item.");
                System.out.print("Enter item id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter new item name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                boolean result = tracker.replace(id, item);
                if (result) {
                    System.out.println("Replacement was successful.");
                } else {
                    System.out.println("Replacement was not.");
                    System.out.println("Element with id: " + id + " - does not exist.");
                }
            } else if (select == 3) {
                System.out.println("Delete item.");
                System.out.print("Enter item id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.findById(id) != null) {
                    tracker.delete(id);
                    System.out.println("Item was deleted.");
                } else {
                    System.out.println("Element with id: " + id + " - does not exist.");
                }
            } else if (select == 4) {
                System.out.println("Find item by Id.");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.findById(id) != null) {
                    Item item = tracker.findById(id);
                    System.out.println(item);
                } else {
                    System.out.println("Item with id: " + id + " - not found.");
                }
            } else if (select == 5) {
                System.out.println("Find items by name.");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                if (result.length > 0) {
                    for (Item item : result) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Items with name: " + name + " - not found.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nMenu.");
        System.out.println("0. Add new Item\n"
                         + "1. Show all items\n"
                         + "2. Edit item\n"
                         + "3. Delete item\n"
                         + "4. Find item by Id\n"
                         + "5. Find items by name\n"
                         + "6. Exit Program\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
