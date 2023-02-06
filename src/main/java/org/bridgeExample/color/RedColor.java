package org.bridgeExample.color;

public class RedColor implements Color{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public void applyColor() {
        System.out.print(ANSI_RED);
    }
}
