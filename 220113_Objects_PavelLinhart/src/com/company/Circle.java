package com.company;

/*Implement the <code>Circle</code> class. It should extend the <code>Shape</code> class. Implementation
should meet the below criteria:
- information about the radius value
- non-arguments constructor which will set: the <code>color</code> field value to <code>unknown</code>,
the <code>isFilled</code> field value to <code>false</code> and the radius field value to <code>1</code>
- three-arguments constructor: <code>color</code>, <code>isFilled</code>, <code>radius</code>
- <code>getter</code> methods which will be responsible for returning the <code>radius</code> value
- <code>setter</code> methods which will be responsible for setting the <code>radius</code> value
- <code>getArea</code> method which will be responsible for calculating the surface area
- <code>getPerimeter</code> method which will be responsible for calculating the circuit
- <code>toString</code> method which should return the following information: <code>Circle
  with radius=? which is a subclass off y</code>, where ? is a placeholder for
  the radius value and the <code>y</code> info should be a result of the <code>toString</code>
  execution from the base class
  ---------------------------------
  The <code>Circle</code> class should implement the <code>GeometricObject</code> interface, and it
should contain the <code>radius</code> field. Methods from <code>GeometricObject</code> interface
should be implemented according to the mathematics rules.
*/

public class Circle extends Shape implements GeometricObject{
    private float radius;

    public Circle() {
        this.radius = 1.0f;
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }


    @Override
    public String toString() {
        String text ="Circle with radius= " + radius+" which is subclass off ";
                text+= super.toString();
                return text;
    }
}
