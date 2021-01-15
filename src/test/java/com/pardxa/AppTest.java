package com.pardxa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * When pull speed cord 4 times, the fan should stop (0)
     */
    @Test
    void pullCordSpeed4Times() {
        CeilingFanCtrl cfc = new CeilingFanCtrl();
        cfc.pullCordSpeed();
        cfc.pullCordSpeed();
        cfc.pullCordSpeed();
        int speed = cfc.pullCordSpeed();
        assertEquals(0, speed);
    }

    /**
     * When pull speed cord 2 times, then pull reverse cord , then pull speed cord 1
     * more times the fan should run at 3 but anticlockwise (-3)
     */
    @Test
    void pullCordSpeed2TimesThenReverse() {
        CeilingFanCtrl cfc = new CeilingFanCtrl();
        cfc.pullCordSpeed();
        cfc.pullCordSpeed();
        cfc.pullCordDirection();
        int speed = cfc.pullCordSpeed();
        assertEquals(-3, speed);
    }
}
