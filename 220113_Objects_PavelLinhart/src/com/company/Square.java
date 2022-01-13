package com.company;
/*
### Square class
Implement the <code>Square</code> class which will extend the <code>Rectangle</code> class. It should
not add any new field or feature, but it should force square behaviour on the base
class methods.
 */

public class Square extends Rectangle implements GeometricObject{
    public Square() {
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public double getArea() {
        return getWidth()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4*getLength();
    }

    @Override
    public String toString() {
        return "Square with side= " +  super.getWidth()+
                " which is special case off subclass "+super.toString();
    }
}

