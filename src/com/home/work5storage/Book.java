package com.home.work5storage;

public class Book {
    private String title;
    private int pageCount;
    private int year;
    private  Author[] authors;// = new Author[5];
//обязательные параметры
    public Book(String title,int authorsCount) {
        this.title = title;
        authors = new Author[authorsCount];
        //в конструктор передаем значение тех свойство.которые обязательно нужно установить(книга и авторы)
        //значение pageCount и year не обязательно
    }
//необязательные параметры
    public void setPagedCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addAuthor(Author author){
      for (int i = 0; i < authors.length; i++) {
          if(authors[i] == null){
            authors [i] =author;
            return;
          }

      }

  }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
    }

    public Author[] getAuthors() {
        return authors;
    }
}
