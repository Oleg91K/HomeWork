package com.home.school;

public  class Teacher implements TeachInterface{
    private String nameTeacher;
    private int ageTeacher;
    private String ObjectT;

    public Teacher(String nameTeacher, int ageTeacher, String objectT) {
        this.nameTeacher = nameTeacher;
        this.ageTeacher = ageTeacher;
        ObjectT = objectT;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public int getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(int ageTeacher) {
        if(ageTeacher<=0) System.out.println("Он не может учить!");
        this.ageTeacher = ageTeacher;
    }

    public String getObjectTS() {
        return ObjectT;
    }

    public void setObjectTS(String objectTS) {
        ObjectT = objectTS;
    }

    @Override
    public void Teach(int count) {

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameTeacher='" + nameTeacher + '\'' +
                ", ageTeacher=" + ageTeacher +
                ", ObjectTS='" + ObjectT + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("nameTeacher:"+ this.nameTeacher+"\nageTeacher"+this.ageTeacher);


    }
}
