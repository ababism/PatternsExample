package org.bridgeExample.main;

import org.bridgeExample.brushes.*;
import org.bridgeExample.color.*;

public class Main {
    public static void main(String[] args) {

        Color red = new RedColor();
        Color green = new GreenColor();

        PaintingTool pencilTool = new Pencil(red);
        PaintingTool brushTool = new Brush(green);

        pencilTool.Paint(10);
        brushTool.Paint(10);
    }
}
