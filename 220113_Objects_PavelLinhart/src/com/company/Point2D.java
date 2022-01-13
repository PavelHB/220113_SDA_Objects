package com.company;
/*
### Point2D class
Implement the <code>Point2D</code> class. It should contain:
- two float fields: <code>x</code>, <code>y</code>
- non-arguments constructor which will set <code>x</code>, <code>y</code> fields to 0
- two-arguments constructor: <code>float x</code>, <code>float y</code>
- <code>getter</code> methods which will be responsible for returning <code>x</code>, <code>y</code> fields values
- <code>getXY</code> method which will return <code>x</code>, <code>y</code> values as two-element array
- <code>setter</code> methods which will be responsible for setting <code>x</code>, <code>y</code> fields values
- <code>setXY</code> method which will be responsible for settting <code>x</code> and <code>y</code>
- <code>toString</code> method which should return string in the following format: <code>(x,
y)</code>
 */

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }


    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x,y)=(" + x +
                "," + y +
                ")";
    }
}
