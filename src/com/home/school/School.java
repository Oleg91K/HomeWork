package com.home.school;

import java.util.Arrays;

public class School {
    private String nameSchool = "ИТМО";
    private Director[] directorMembers;
    private Student[] studentsMembers;
    private Teacher[] teachersMembers;


    public School(String nameSchool) {
        this.nameSchool = nameSchool;
        this.directorMembers = directorMembers;
        this.studentsMembers = studentsMembers;
        this.teachersMembers = teachersMembers;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < studentsMembers.length; i++) {
            if (studentsMembers[i] == null) {
                studentsMembers[i] = student;
                return;
            }
        }
    }

    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachersMembers.length; i++) {
            if (teachersMembers[i] == null) {
                teachersMembers[i] = teacher;
                return;
            }
        }
    }
    public void addDirector(Director director){
        for (int i = 0; i < directorMembers.length; i++) {
            if (directorMembers[i] == null){
                directorMembers[i] = director;
                return;
            }

        }
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public Director[] getDirectorMembers() {
        return directorMembers;
    }

    public void setDirectorMembers(Director[] directorMembers) {
        this.directorMembers = directorMembers;
    }

    public Student[] getStudentsMembers() {
        return studentsMembers;
    }

    public void setStudentsMembers(Student[] studentsMembers) {
        this.studentsMembers = studentsMembers;
    }

    public Teacher[] getTeachersMembers() {
        return teachersMembers;
    }

    public void setTeachersMembers(Teacher[] teachersMembers) {
        this.teachersMembers = teachersMembers;
    }

    @Override
    public String toString() {
        return "School{" +
                "nameSchool='" + nameSchool + '\'' +
                ", directorMembers=" + Arrays.toString(directorMembers) +
                ", studentsMembers=" + Arrays.toString(studentsMembers) +
                ", teachersMembers=" + Arrays.toString(teachersMembers) +
                '}';
    }
}




