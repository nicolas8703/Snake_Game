package gui;

import game.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class Draw extends JLabel {

    private Snake snake;
    private Gui gui;


    public Draw(Snake snake, Gui gui) {
        this.snake = snake;
        this.gui = gui;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        //Hintergrund
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0, gui.getWidth(), gui.getHeight());
        //Schlange
        g.setColor(Color.GREEN);
        Point point;
        for (int i = 0; i < snake.getTails().size(); i++) {
            point = gui.ptc(snake.getTails().get(i).getX(), snake.getTails().get(i).getY());
            g.fillRect(point.x, point.y, 30, 30);
        }
        //Kopf
        g.setColor(Color.BLUE);
        point = gui.ptc(snake.getHeadX(), snake.getHeadY());
        g.fillRect(point.x, point.y, 32,32);
        //Item
        g.setColor(Color.cyan);
        point = gui.ptc(snake.getItem().getX(), snake.getItem().getY());
        g.fillRect(point.x, point.y,32,32);
        //Grid
        g.setColor(Color.GRAY);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                g.drawRect(i * 32 + gui.getXoff(),j * 32 + gui.getYoff(), 32,32);
            }
        }
        //Border
        g.setColor(Color.BLACK);
        g.drawRect(gui.getXoff(),  gui.getYoff(), 512,512);
        //Score
        g.setFont(new Font("Sans Serif", Font.BOLD, 15));
        g.drawString("Highscore: " + snake.getHighscore(),550,60);
        g.drawString("Score: " + snake.getScore(),550,40);

        repaint();
    }
}