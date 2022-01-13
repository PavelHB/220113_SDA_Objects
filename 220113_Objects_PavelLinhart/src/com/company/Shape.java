package com.company;

/*
### Shape class
Implement the <code>Shape</code> class. It should contain:
- color information
- information if color should fill a shape
- non-arguments constructor which will set: the <code>color</code> field to <code>unknown</code> and
  the <code>isFilled</code> field to <code>false</code>
- two-arguments constructor: <code>color</code>, <code>isFilled</code>
- <code>getter</code> methods which will be responsible for returning declared fields
- <code>setter</code> methods which will be responsible for setting declared fields
- <code>toString</code> method which should return the following information: <code>Shape
  with color of ? and filled/NotFilled</code>, where ? is a placeholder for the
  color and the <code>filled / not filled</code> info should be returned depending on
  the <code>isFilled</code> field

## Task 4
Modify implementation prepared as a scope of task 3. Refactor the following
functionality:
- make the <code>Shape</code> class abstract
- change the <code>Shape</code> class fields access modifiers to <code>protected</code>
- add two abstract methods: <code>getArea</code> and <code>getPerimeter</code>

Each class which is extending the <code>Shape</code> class directly/indirectly should override
  abstract methods from base class.

Please provide an example usage of above implementation.
 */


public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){
        String text="Shape with color of "+color+" and ";
        if(isFilled){
            text+="filled";
        } else{
            text+="not filled";
        }return text;
    }

}
