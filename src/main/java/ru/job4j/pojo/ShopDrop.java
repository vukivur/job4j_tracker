package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if (i < products.length - 1) {
                products[i] = products[i + 1];
            } else {
                products[i] = null;
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            System.out.println("Product name: " + product.getName() + ". Product count: " + product.getCount());
        }
        System.out.println("\nAfter delete product[1]:");
        products[1] = null;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println("Product name: " + product.getName() + ". Product count: " + product.getCount());
            } else {
                System.out.println("Null");
            }
        }
    }
}
