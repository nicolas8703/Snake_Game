package game;

import actions.Collide;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class GameTimer extends Thread{
    public boolean running = true;
    private Collide collide;
    private Snake snake;

    public GameTimer(Collide collide, Snake snake) {
    this.collide = collide;
    this.snake = snake;
    }

    public void run(){
        while(running){
            try {
                sleep(collide.getSpeed());
                snake.move();
                snake.setWaitBeforMove(false);
                collide.collideItem();
                if(collide.collideItself()){
                    snake.setScore(0);
                    snake.getTails().clear();
                }
                if(collide.collideWall()){
                    snake.setHeadX(7);
                    snake.setHeadY(7);
                    snake.setScore(0);
                    snake.getTails().clear();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

