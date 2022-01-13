package com.company;
/*
 ### MovableCircle class
The <code>MovableCircle</code> class should implement the <code>Movable</code> interface and should
        contain (as a composition) instance of <code>MovablePoint</code> class. It should contain
        fields necessary to define circle radius.
        - the <code>moveUp()</code> and the <code>moveDown()</code> method should increase/decrease the
<code>y</code> coordinate from <code>MovablePoint</code> instance by provided <code>ySpeed</code> value
        - the <code>moveLeft</code> and the <code>moveRight()</code> method should increase/decrease the
<code>x</code> coordinate from <code>MovablePoint</code> instance by provided <code>xSpeed</code> value
        - Please provide an example usage of above implementation. Please consider presenting polymorphism as well.
 */

public class MovableCircle implements Movable{
    private MovablePoint movablePoint;
    private float radius;

    public MovableCircle(int x, int y, float radius) {
        this.movablePoint = new MovablePoint(x,y);
        this.radius = radius;
    }

    public MovableCircle(int x, int y,int xSpeed,int ySpeed, float radius) {
        this.movablePoint = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public MovablePoint getMovablePoint() {
        return movablePoint;
    }

    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
        System.out.println("But i'm not only point now. I'm the center of circle!" +
                "\nThis method move Up() now perform different task. It's called polymorphism.");
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRigth() {
        movablePoint.moveRigth();
    }

    @Override
    public String toString() {
        return "MovableCircle: S(x,y)=(" + movablePoint.getX() +"," + movablePoint.getY() +") r= " +getRadius()+
                ", speed of move(x,y)=(" + movablePoint.getxSpeed() + "," + movablePoint.getySpeed() +")";
    }
}
