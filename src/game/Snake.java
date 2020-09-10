package game;

import java.util.ArrayList;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class Snake {

    private int score = 0;
    private int highscore = 0;

    private boolean waitBeforMove = false;
    private  Item item = new Item();

    private ArrayList<Tail> tails = new ArrayList<>();

    private int headX = 7;
    private int headY = 7;
    private Direction direction = Direction.right;

    public ArrayList<Tail> getTails() {
        return tails;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public boolean isWaitBeforMove() {
        return waitBeforMove;
    }

    public void setWaitBeforMove(boolean waitBeforMove) {
        this.waitBeforMove = waitBeforMove;
    }

    public Item getItem() {
        return item;
    }

    public int getHeadX() {
        return headX;
    }

    public void setHeadX(int headX) {
        this.headX = headX;
    }

    public int getHeadY() {
        return headY;
    }

    public void setHeadY(int headY) {
        this.headY = headY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void addSchwanz(){
        if(tails.size() < 1){
            tails.add(new Tail(headX, headY));
        }else {
            tails.add(new Tail(tails.get(tails.size() - 1).x, tails.get(tails.size()-1).y));
        }
    }
    public void move(){
        if(tails.size() >= 2){
            for (int i = tails.size() - 1; i >= 1 ; i--) {
                if(tails.get(i).isWarten()){
                    tails.get(i).setWarten(false);
                }else{
                    tails.get(i).setX(tails.get(i-1).getX());
                    tails.get(i).setY(tails.get(i-1).getY());
                }
            }
        }
        if(tails.size() >= 1){
            if(tails.get(0).isWarten()){
                tails.get(0).setWarten(false);
            }else{
                tails.get(0).setX(headX);
                tails.get(0).setY(headY);
            }
        }
        switch (direction){
            case right:
                headX = headX+1;
                break;
            case up:
                headY = headY-1;
                break;
            case left:
                headX = headX-1;
                break;
            case down:
                headY = headY+1;
                break;
        }
    }
}


