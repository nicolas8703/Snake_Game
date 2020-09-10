package gui;

import javax.swing.*;

import actions.KeyHandler;
import game.Snake;

import java.awt.*;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class Gui {

    private int width = 800;
    private int height = 600;
    private int xoff = 130;
    private int yoff = 20;


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getXoff() {
        return xoff;
    }

    public int getYoff() {
        return yoff;
    }

    public Gui(Snake snake){
        JFrame frame = new JFrame("Snake");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addKeyListener(new KeyHandler(snake));

        Draw z = new Draw(snake, this);
        z.setBounds(0,0, width, height);
        z.setVisible(true);
        frame.add(z);

        frame.requestFocus();
        frame.setVisible(true);
    }
    public Point ptc(int x, int y){
        Point point = new Point(0,0);
        point.x= x * 32 + xoff;
        point.y= y * 32 + yoff;
        return point;
    }
}
