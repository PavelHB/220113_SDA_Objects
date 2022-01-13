package com.company;
/*
   ### MovablePoint class
The <code>MovablePoint</code> class should implement the <code>Movable</code> interface and should
        contain 4 fields: <code>int</code> : <code>x</code>, <code>y</code>, <code>xSpeed</code>, <code>ySpeed</code>.
        The <code>x</code>, <code>y</code> fields should define the
        coordinates of point and the <code>xSpeed</code>, <code>ySpeed</code> fields should determine how much
        the appropriate coordinates should change.
        - the <code>moveUp()</code> and the <code>moveDown()</code> method should increase/decrease the
<code>y</code> coordinate by provided <code>ySpeed</code> value
        - the <code>moveLeft()</code> and the <code>moveRight()</code> method should increase/decrease
        the <code>x</code> coordinate by provided <code>xSpeed</code> value
 */

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.xSpeed=1;
        this.ySpeed=1;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y=y+ySpeed;
        System.out.println("Point is moving up!");
    }

    @Override
    public void moveDown() {
        y=y-ySpeed;
    }

    @Override
    public void moveLeft() {
        x=x-xSpeed;
    }

    @Override
    public void moveRigth() {
        x=x+xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: (x,y)=(" + x +"," + y +")" +
                ", speed of move(x,y)=(" + xSpeed + "," + ySpeed +")" ;
    }
}
