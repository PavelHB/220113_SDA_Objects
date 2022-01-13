package com.company;
/*
### Point3D class
Using the <code>Point2D</code> class implement the <code>Point3D</code> class. It should extend the
<code>Point2D</code> class. It should contain:
- private float field: <code>z</code>
- three-arguments constructor: <code>float x</code>, <code>float y</code>, <code>float z</code>
- <code>getter</code> method which will be responsible for returning the <code>z</code> field value
- <code>getXYZ</code> method which will return <code>x</code>, <code>y</code>, <code>z</code> values as three-element array
- <code>setter</code> method which will be responsible for setting the <code>z</code> field value
- <code>setXYZ</code> method which will be responsible for setting <code>x</code>, <code>y</code>, <code>z</code>
- <code>toString</code> method which should return string in the following format: <code>(x,
y, z)</code>
 */

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(x,y,z)=(" + getX() +","+ getY()+","+z+")";
    }
}
