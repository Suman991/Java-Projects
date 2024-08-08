package PingPong;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;
    int speed=10;

    Paddle(int x,int y,int PADDLE_WIDTH,int PADDLE_HEIGHT,int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);   //will create paddle structure as rectangular shape
        this.id=id;
    }

    //my keyPressed() method
    public void keyPressed(KeyEvent e){
        switch(id){
            case 1:
                    if(e.getKeyCode()==KeyEvent.VK_W){
                        setYDirection(-speed);
                        move();
                    }
                    if(e.getKeyCode()==KeyEvent.VK_S){
                        setYDirection(speed);
                        move();
                    }
                    break;
            case 2:
                    if(e.getKeyCode()==KeyEvent.VK_UP){
                        setYDirection(-speed);
                        move();
                    }
                    if(e.getKeyCode()==KeyEvent.VK_DOWN){
                        setYDirection(speed);
                        move();
                    }
                    break;
        }

    }

    //my keyReleased() method
    public void keyReleased(KeyEvent e){
        switch(id){
            case 1:
                    if(e.getKeyCode()==KeyEvent.VK_W){
                        setYDirection(0);
                        move();
                    }
                    if(e.getKeyCode()==KeyEvent.VK_S){
                        setYDirection(0);
                        move();
                    }
                    break;
            case 2:
                    if(e.getKeyCode()==KeyEvent.VK_UP){
                        setYDirection(0);
                        move();
                    }
                    if(e.getKeyCode()==KeyEvent.VK_DOWN){
                        setYDirection(0);
                        move();
                    }
                    break;
        }
    }

    public void setYDirection(int yDirection){
        yVelocity=yDirection;
    }

    public void draw(Graphics g){
        if(id==1)   //paddle 1
            g.setColor(Color.BLUE);
        else        //paddle 2
            g.setColor(Color.red);
        g.fillRect(x,y,width,height);  //will draw paddle at point(x,y) with specified width and height
    }

    public void move(){
        y=y+yVelocity;
    }


}
