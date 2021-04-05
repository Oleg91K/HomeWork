package com.home.catmouse;

public class Mouse {
    private int speedMouse;

    public Mouse(int speedMouse) {
        this.speedMouse = speedMouse;
    }

    public int getSpeedMouse() {
        return speedMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speedMouse=" + speedMouse +
                '}';
    }
}
