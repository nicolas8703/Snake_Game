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
    private Snake snake;
    private long speed = 250;

    public Collide(Snake snake) {
      this.snake = snake;
    }

    public boolean collideItself(){
        for (int i = 0; i < snake.getTails().size(); i++) {
            if(snake.getHeadX() == snake.getTails().get(i).getX() && snake.getHeadY() == snake.getTails().get(i).getY() && !snake.getTails().get(i).isWarten()){
                speed = 250;
                return true;
            }
        }
        return false;
    }
    public boolean collideWall(){
        if(snake.getHeadX() < 0 || snake.getHeadX() > 15 || snake.getHeadY() < 0 || snake.getHeadY() > 15){
            speed = 250;
            return (true);
        }
        return (false);
    }
    public void collideItem(){
        if(snake.getHeadX() == snake.getItem().getX() && snake.getHeadY() == snake.getItem().getY()){
            snake.getItem().reset();
            snake.addSchwanz();
            snake.setScore(snake.getScore()+ 1);
            speed = (long)(speed * 0.95);
            if(snake.getScore() > snake.getHighscore()){
                snake.setHighscore(snake.getScore());
            }
        }
    }
    public long getSpeed() {
        return speed;
    }
}
