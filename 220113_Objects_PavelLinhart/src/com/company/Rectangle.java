package com.company;
/*
### Rectangle class
Implement the <code>Rectangle</code> class. It should extend the <code>Shape</code> class.
Implementation should meet the below criteria:
- information about the width and length value as a <code>double</code> type
- non-arguments constructor which will set: the <code>color</code> field value to <code>unknown</code>,
the <code>isFilled</code> field value to <code>false</code> and the width and length field value to
  <code>1</code>
- four-arguments constructor: <code>color</code>, <code>isFilled</code>, <code>width</code> and <code>length</code>
- <code>getter</code> methods which will be responsible for returning the <code>width</code> and
  <code>length</code> value
- <code>setter</code> methods which will be responsible for setting the <code>width</code> and
  <code>length</code> value
- <code>getArea</code> method which will be responsible for calculating the surface area
- <code>getPerimeter</code> method which will be responsible for calculating the circuit
- <code>toString</code> method which should return the following information:
  <code>Rectangle with width=? and length=? which is a subclass off y</code>,
where ? is a placeholder for the width and length value accordingly and the
  <code>y</code> info should be a result of the <code>toString</code> execution from the base class
 */

public class Rectangle extends Shape implements GeometricObject{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*width+2*length;
    }

    /*
    <code>Rectangle with width=? and length=? which is a subclass off y</code>,
where ? is a placeholder for the width and length value accordingly and the
  <code>y</code> info should be a result of the <code>toString</code> execution from the base class
 */

    @Override
    public String toString() {
        return "Rectangle with width= " + width +
                " and length= "+ length +" which is subclass off "+super.toString();

    }
}
