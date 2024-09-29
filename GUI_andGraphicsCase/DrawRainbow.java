package com.GUI_andGraphicsCase;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{

    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);


    private Color[] colors =
            { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
                    Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

    public DrawRainbow()
    {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radius = 20;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Bottom rainbow (original)
        drawRainbow(g, centerX, getHeight() - 10, radius, 0, 180);

        // Top rainbow
        drawRainbow(g, centerX, 10, radius, 180, 180);

        // Left rainbow
        drawRainbow(g, 10, centerY, radius, 90, -180);

        // Right rainbow
        drawRainbow(g, getWidth() - 10, centerY, radius, 270, -180);
    }

    private void drawRainbow(Graphics g, int centerX, int centerY, int radius, int startAngle, int arcAngle) {
        // Draw each arc for the rainbow with specified start and arc angles
        for (int counter = colors.length; counter > 0; counter--) {
            g.setColor(colors[counter - 1]);
            g.fillArc(centerX - counter * radius,
                    centerY - counter * radius,
                    counter * radius * 2, counter * radius * 2, startAngle, arcAngle);
        }
    }
}