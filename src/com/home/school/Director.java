package com.home.school;

public abstract class Director implements DirectorInterface{
    private String nameDirector;
    private int ageDirector;
    private int firstTime;
    private int secondTime;

    public Director(String nameDirector, int ageDirector) {
        this.nameDirector = nameDirector;
        this.ageDirector = ageDirector;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    public int getAgeDirector() {
        return ageDirector;
    }

    public void setAgeDirector(int ageDirector) {
        if(ageDirector<=0) System.out.println("Он не может быть директором!");
        this.ageDirector = ageDirector;
    }

    @Override
    public int startStudy() {
        int a= 8;
        int b= 3;
        int count = a + (int) (Math.random() * b);
        setFirstTime((this.firstTime));
        return count;

    }
    @Override
    public int endStudy() {
        int a = 16;
        int b = 2;
        int count = a +(int)(Math.random()*b);
        setSecondTime((this.secondTime+count));
        return count;

    }

    public int getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(int firstTime) {
        if(firstTime<0)this.firstTime=0;
        this.firstTime = firstTime;
    }

    public int getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(int secondTime) {
        if(secondTime<0)this.secondTime=0;
        this.secondTime = secondTime;
    }

    @Override
    public String toString() {
        return "Director{" +
                "nameDirector='" + nameDirector + '\'' +
                ", ageDirector=" + ageDirector +
                '}';
    }

    @Override
    public void info() {
        System.out.println("nameTeacher:"+ this.nameDirector+"\nageTeacher"+this.ageDirector);


    }
}
