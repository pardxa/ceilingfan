package com.pardxa;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int speed=4;
        speed%=4;
        System.out.println(speed);
    }
}
