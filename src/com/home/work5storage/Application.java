package com.home.work5storage;

public class Application {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book book1 = new Book("Книга", 2);
        book1.setPagedCount(378);
        book1.setYear(1990);
        book1.addAuthor(pushkin);
        book1.addAuthor(tolstoy);

        Storage storage = new Storage();
        storage.addBook(book1);
        for (Book b : storage.getBooks()) {
            //вывести название книги
            //вывести имена и фамилии авторов
            System.out.println("===Книга===");
            System.out.println(b.getTitle());
            System.out.println("Авторы");
            for (Author author : b.getAuthors()) {//Authors []
                System.out.println(author.getName());
                System.out.println(author.getSurname());

            }
        }
    }
}




