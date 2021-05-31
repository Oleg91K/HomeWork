package com.home.OOP.school;

import java.util.Scanner;

import static com.home.OOP.school.Randoms.adultAge;
import static com.home.OOP.school.Randoms.nameGen;

public class Principal {

    private final String name = nameGen();
    private final int age = adultAge();

    public Principal() {
    }


    public void startDay(School school /*Teacher[] teachers, Apprentice[] apprentices*/) {
        Scanner scanner = new Scanner(System.in);
        String condition = "продолжить";
        while (condition.equals("продолжить")) {
            System.out.println("Закончить или продолжить?");
            condition = scanner.next();
            switch (condition){
                case "продолжить" :
                    for (int i = 0; i < school.getTeachers().length; i++) {
                        school.getTeachers()[i].startLesson(school.getApprentices());
                    }
                case "закончить" : break;
            }
        }
    }


    @Override
    public String toString() {
        return "Директор. Имя: " + name +
                ", Возрат: " + age;
    }
}
