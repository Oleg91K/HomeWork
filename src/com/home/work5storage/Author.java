package com.home.work5storage;

public class Author {
    private String name;
    private String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //если нет конструктора то сеттеры нужны.если есть.то не нужны


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
