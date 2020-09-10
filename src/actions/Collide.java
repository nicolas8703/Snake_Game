package actions;

import game.Item;
import game.Snake;
import game.Tail;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class Collide {
    Snake snake;
    Tail tail;
    Item item;
    public Collide(Snake snake, Tail tail, Item item) {
      this.snake = snake;
      this.tail = tail;
      this.item = item;
    }

    public boolean collideItself(){
        for (int i = 0; i < snake.getTails().size(); i++) {
            if(snake.getHeadX() == snake.getTails().get(i).getX() && snake.getHeadY() == snake.getTails().get(i).getY() && !snake.getTails().get(i).isWarten()){
                return true;
            }
        }
        return false;
    }
    public boolean collideWall(){

        return (snake.getHeadX() < 0 || snake.getHeadX() > 15 || snake.getHeadY() < 0 || snake.getHeadY() > 15);
    }
    public void collideItem(){
        if(snake.getHeadX() == snake.getItem().getX() && snake.getHeadY() == snake.getItem().getY()){
            snake.getItem().reset();
            snake.addSchwanz();
            snake.setScore(snake.getScore()+ 1);
            if(snake.getScore() > snake.getHighscore()){
                snake.setHighscore(snake.getScore());
            }

        }
    }
}
