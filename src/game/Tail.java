package game;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class Tail {
    int x;
    int y;
    boolean warten = true;

    public Tail(){
    }

    public Tail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isWarten() {
        return warten;
    }

    public void setWarten(boolean warten) {
        this.warten = warten;
    }
}
