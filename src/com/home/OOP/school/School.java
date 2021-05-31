package com.home.OOP.school;

import java.util.Arrays;

import static com.home.OOP.school.Randoms.schoolName;
import static com.home.OOP.school.Settings.APPRENTICES_COUNT;
import static com.home.OOP.school.Settings.TEACHERS_COUNT;

public class School {

    private final String name = schoolName();
    private final Principal principal;
    private Teacher[] teachers = new Teacher[APPRENTICES_COUNT];
    private Apprentice[] apprentices = new Apprentice[APPRENTICES_COUNT];

    public School() {
        principal = new Principal();
        apprentices = new Apprentice[APPRENTICES_COUNT];
        for (int i = 0; i < apprentices.length; i++) {
            apprentices[i] = Apprentice.getApprentice();
        }
        teachers = new Teacher[TEACHERS_COUNT];
        for (int j = 0; j < teachers.length; j++) {
            teachers[j] = Teacher.getTeacher();
        }
    }





    public String getName() {
        return name;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Apprentice[] getApprentices() {
        return apprentices;
    }

    @Override
    public String toString() {
        return "Школа. Название: " + name +
                ", Директор: " + principal +
                ", Учителя: " + Arrays.toString(teachers) +
                ", Ученики: " + Arrays.toString(apprentices);
    }
}