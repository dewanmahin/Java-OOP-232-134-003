package com.GUI_Chapter8;

import javax.swing.JFrame;

public class TestDraw
{
    public static void main(String[] args)
    {
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}