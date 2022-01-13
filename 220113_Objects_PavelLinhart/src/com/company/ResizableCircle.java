package com.company;
/*
### ResizableCircle class
The <code>ResizableCircle</code> class should implement <code>Resizable</code> interface. The
<code>resize</code> method from interface should reduce the radius of the circle in
percentage.
 */

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle() {
    }

    public ResizableCircle(String color, boolean isFilled, float radius) {
        super(color, isFilled, radius);
    }

    @Override
    public void resize(int percent) {
        setRadius((float) (getRadius()*0.01*percent));
    }
}
