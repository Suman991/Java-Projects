package PingPong;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {

    Random random;
    int xVelocity, yVelocity;
    int initialSpeed=3;

    Ball(int x,int y,int width,int height){
        super(x,y,width,height);    // will create a rectangular(square) shape where ball will be drawn
        random=new Random();

        int randomXDirection=random.nextInt(2);  //can generate only 0  or  1  randomly
        if(randomXDirection==0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);

        int randomYDirection =random.nextInt(2);  //can generate only 0  or  1  randomly
        if(randomYDirection ==0)
            randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);

    }

    public void setXDirection(int randomXDirection){
        xVelocity=randomXDirection;
    }

    public void setYDirection(int randomYDirection){
        yVelocity=randomYDirection;
    }

    public void draw(Graphics g){
            g.setColor(Color.white);
            g.fillOval(x,y,width,height);   //draw ball  within the square shape
    }

    public void move(){
        x=x+xVelocity;
        y=y+yVelocity;
    }
}
