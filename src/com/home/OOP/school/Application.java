package com.home.OOP.school;

public class Application {
    public static void main(String[] args) {

        School school = new School();

        school.getPrincipal().startDay(school);

        System.out.println(school);



    }
}