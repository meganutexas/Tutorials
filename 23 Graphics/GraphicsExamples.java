package Graphics;

import java.awt.*;

public class GraphicsExamples {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);

        Graphics graphics = panel.getGraphics();

        graphics.fillRect(0, 0, 100, 100);
        graphics.setColor(Color.RED);
        graphics.drawRect(0, 0, 100, 100);

    }
}
