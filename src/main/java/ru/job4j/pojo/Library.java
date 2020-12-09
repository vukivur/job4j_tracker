package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 250);
        Book headFirst = new Book("Head First Java", 718);
        Book grokking = new Book("Grokking Algorithms", 289);
        Book patterns = new Book("Design Patterns", 650);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirst;
        books[2] = grokking;
        books[3] = patterns;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book name: " + book.getName() + ". Pages: " + book.getPages());
        }
        System.out.println("\nAfter changes books[index] 0 & 3:");
        Book item = books[0];
        books[0] = books[3];
        books[3] = item;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book name: " + book.getName() + ". Pages: " + book.getPages());
        }
        System.out.println("\nFind book 'Clean code':");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println("Clean code. Book index: " + index + ". Pages: " + book.getPages());
            }
        }
    }
}
