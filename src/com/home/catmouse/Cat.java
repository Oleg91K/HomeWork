package com.home.catmouse;


public class Cat {
    private String name;
    private String color;
    private int speedCat;
    private int weight;
    private Mouse[] mouse;{
    }

    public Cat(int speedCat, int weight, int mouseCount) {
        this.speedCat = speedCat;
        this.weight = weight;
        mouse = new Mouse[mouseCount];
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


}





