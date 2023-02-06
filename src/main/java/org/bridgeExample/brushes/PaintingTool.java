package org.bridgeExample.brushes;

import org.bridgeExample.color.Color;

// abstraction
public abstract class PaintingTool {
    Color toolColor;
    PaintingTool(Color color){
        toolColor = color;
    }

    // operation() (использующая вложенный интерфейс)
    abstract public void Paint(int size);

    public void ChangeColor(Color color) {
        toolColor = color;
    }
}
