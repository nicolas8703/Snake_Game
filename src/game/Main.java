package game;

import actions.Collide;
import gui.Gui;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class Main {

    public static void main(String[] args) {
        Snake snake = new Snake();
        Gui g = new Gui(snake);

        Tail tail = new Tail();
        Item item = new Item();
        Collide collide = new Collide(snake, tail, item);
        GameTimer gT = new GameTimer(collide, snake);

        gT.start();
    }

}
