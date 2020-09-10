package actions;

import game.Direction;
import game.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 4.9.2020
 */


public class KeyHandler implements KeyListener {
    private Snake snake;

    public KeyHandler(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:
                if(!(snake.getDirection() == Direction.down) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.up);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_A:
                if(!(snake.getDirection() == Direction.right) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.left);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_S:
                if(!(snake.getDirection() == Direction.up) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.down);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_D:
                if(!(snake.getDirection() == Direction.left) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.right);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_UP:
                if(!(snake.getDirection() == Direction.down) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.up);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_LEFT:
                if(!(snake.getDirection() == Direction.right) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.left);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_DOWN:
                if(!(snake.getDirection() == Direction.up) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.down);
                    snake.setWaitBeforMove(true);
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(!(snake.getDirection() == Direction.left) && !snake.isWaitBeforMove()){
                    snake.setDirection(Direction.right);
                    snake.setWaitBeforMove(true);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
