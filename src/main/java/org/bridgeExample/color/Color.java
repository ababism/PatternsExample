package org.bridgeExample.color;


public interface Color {
    public static final String ANSI_RESET = "\u001B[0m";
    static void resetColor() {
        System.out.print(ANSI_RESET);
    }

    void applyColor();
}
