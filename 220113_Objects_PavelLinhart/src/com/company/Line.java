package com.company;

/*## Task 5
Implement the <code>Line</code> class which will contain (as a composition) the instance of
two <code>Point2D</code> object from task 1. Those points should be the start and end point
of the line. In addition, this class should implement:
- two-arguments constructor: begin point, end point
- four-arguments constructor accepting 4 parameters: coordinates of the start
and end point
- <code>getter</code> method which will be responsible for returning start and end points
- <code>setter</code> method which will be responsible for setting start and end points
- the method responsible for calculating the length of the line based on the
set points
- the method responsible for returning the coordinates of the point being the
  center of the created line
Please provide an example usage of above implementation.
 */

public class Line {
    private Point2D startPoint;
    private Point2D endPoint;

    public Line(Point2D endPoint) {
        this.startPoint = new Point2D(0,0);
        this.endPoint = endPoint;
    }

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(float xStart,float yStart, float xEnd,float yEnd) {
        this.startPoint = new Point2D(xStart,yStart);
        this.endPoint = new Point2D(xEnd,yEnd);
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public float calculateLength(){
        return (float) Math.sqrt(Math.pow(getStartPoint().getX()-getEndPoint().getX(),2)+
                Math.pow(getStartPoint().getY()-getEndPoint().getY(),2));
        // |AB|sqrt((Ax-Bx))^2+(Ay-By)^2)
    }

    public Point2D getCenterPoint(){
        return new Point2D((getStartPoint().getX()+getEndPoint().getX())/2,(getStartPoint().getY()+getEndPoint().getY())/2);
        // x=(x1+x2)/2  y=(y1+y2)/2
    }

    @Override
    public String toString() {
        return "Line : A" +startPoint +
                ", B" + endPoint;
    }
}
