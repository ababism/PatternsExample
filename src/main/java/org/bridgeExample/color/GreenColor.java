package org.bridgeExample.color;

public class GreenColor implements Color {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    // здесь нам достаточно просто поменять цвет консоли,
    // но в приложении это можго бы быть реализовано по-другому
    // например в цветах могли бы быть эффекты (выброска тени) и другой фукнционал,
    // который мы бы хотели менять независимо от абстракции Painting Tool
    @Override
    public void applyColor() {
        System.out.print(ANSI_GREEN);
    }
}
