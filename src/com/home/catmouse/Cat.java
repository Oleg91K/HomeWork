package com.home.catmouse;


import java.util.Arrays;

public class Cat {
    private String name;
    private String color;
    private int speedCat;
    private int weight;
    private Mouse[] mouse;{
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speedCat=" + speedCat +
                ", weight=" + weight +
                ", mouse=" + Arrays.toString(mouse) +
                '}';
    }
}





