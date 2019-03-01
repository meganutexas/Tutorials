package Graphics;

import java.awt.*;

public class GraphicsExercises {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics graphics = panel.getGraphics();

        // comment in and out for what you want to draw
        //drawCheckerboard(graphics);
        //drawPrideFlag(graphics, 50, 50, 400);
        drawSmileyFace(graphics);
    }

    public static void drawSmileyFace(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(0,0, 500, 500);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(150, 150, 50, 50);
        graphics.fillOval(300, 150, 50, 50);
        graphics.fillArc(150, 200, 200, 200, 180, 180);
    }

    public static void drawPrideFlag(Graphics graphics,
                                     int startX,
                                     int startY,
                                     int width) {
        Color[] colors = {
                Color.RED,
                Color.ORANGE,
                Color.YELLOW,
                Color.GREEN,
                Color.BLUE,
                new Color(138, 43, 226) // purple
        };

        int rowHeight = 50;

        for (int i = 0; i < colors.length; ++i) {
            graphics.setColor(colors[i]);
            graphics.fillRect(startX, startY, width, rowHeight);
            startY += rowHeight;
        }
    }

    public static void drawCheckerboard(Graphics graphics) {
        int startX = 50;
        int startY = 50;
        int currentX;
        int currentY = startY;

        int sideWidth = 50;

        for (int outer = 0; outer < 4; outer++) { // rows
            currentX = startX;
            for (int inner = 0; inner < 8; inner++) { // columns
                if (inner % 2 == 0) {
                    graphics.setColor(Color.RED);
                    graphics.fillRect(currentX, currentY, sideWidth, sideWidth);
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(currentX, currentY+sideWidth, sideWidth, sideWidth);
                } else {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(currentX, currentY, sideWidth, sideWidth);
                    graphics.setColor(Color.RED);
                    graphics.fillRect(currentX, currentY+sideWidth, sideWidth, sideWidth);
                }
                currentX += sideWidth;
            }
            currentY += sideWidth * 2;
        }

        drawCheckerLine(graphics, startX + sideWidth, startY, sideWidth, Color.BLUE);
        drawCheckerLine(graphics, startX, startY + sideWidth, sideWidth, Color.BLUE);
        drawCheckerLine(graphics, startX + sideWidth, startY + 6*sideWidth, sideWidth, Color.CYAN);
        drawCheckerLine(graphics, startX, startY + 7*sideWidth, sideWidth, Color.CYAN);
    }

    public static void drawCheckerLine(Graphics graphics,
                                       int startX,
                                       int startY,
                                       int sideWidth,
                                       Color color) {
        graphics.setColor(color);
        for (int i = 0; i < 4; i++) {
            graphics.fillOval(startX, startY, sideWidth, sideWidth);
            startX += 2*sideWidth;
        }
    }
}
