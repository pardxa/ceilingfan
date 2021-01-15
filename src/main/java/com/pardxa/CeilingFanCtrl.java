package com.pardxa;

public class CeilingFanCtrl {
    private int speed = 0;
    private boolean clockwise = true;

    private int output() {
        return clockwise ? speed : (-1 * speed);
    }

    public int pullCordSpeed() {
        speed++;
        speed %= 4;
        return output();
    }

    public int pullCordDirection() {
        clockwise = (!clockwise);
        return output();
    }

}
