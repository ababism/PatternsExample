package org.bridgeExample.brushes;

import org.bridgeExample.color.Color;

public class Brush extends PaintingTool {

    public Brush(Color color) {
        super(color);
    }

    @Override
    public void Paint(int size) {
        toolColor.applyColor();
        for (int i = 0; i < size; i++) {
            System.out.print("=");
        }
        System.out.print("\n");
        Color.resetColor();
    }

}
