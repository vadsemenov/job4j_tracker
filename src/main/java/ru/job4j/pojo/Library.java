package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean code", 200);
        books[1] = new Book("Java", 200);
        books[2] = new Book("C++", 200);
        books[3] = new Book("C#", 200);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + books[i].getName() + " " + books[i].getNumberOfPages() + "pages");
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Book " + books[i].getName() + " " + books[i].getNumberOfPages() + "pages");
            }
        }
    }
}
