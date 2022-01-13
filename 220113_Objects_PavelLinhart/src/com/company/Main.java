package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point2D point2D= new Point2D();
        System.out.println(point2D);
        point2D.setXY(-5.04f,6.21f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(1.0f,2.6f,3.8f);
        System.out.println("\n"+point3D);
        point3D.setXY(2.0f,0.6f);
        System.out.println(point3D);
        point3D.setXYZ(-2.0f,-2.6f,66.8f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        Student student = new Student("Bc.",1,20000);
        student.setName("James Johnson");
        student.setAddress("1 Chapel Hill, Heswall, Bornemouth");
        System.out.println("\n"+student);

        Staff staff = new Staff("Chemistry",35000);
        staff.setName("Albus Brian");
        staff.setAddress("46 Baker Street, London");
        System.out.println("\n"+staff);

        Circle circle =new Circle();
        System.out.println("\n"+circle);
        circle.setColor("blue");
        circle.setFilled(true);
        circle.setRadius(10.01f);
        System.out.println(circle+ " has area= "+circle.getArea()+ " and perimeter= "+circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println("\n"+rectangle);
        Rectangle rectangle1 = new Rectangle("Yellow",true,15,12);
        System.out.println(rectangle1+ " has area= "+rectangle1.getArea()+ " and perimeter= "+rectangle1.getPerimeter());

        Square square = new Square();
        System.out.println("\n"+square);
        Square square1 = new Square("Red",false,15);
        System.out.println(square1+ " has area= "+square1.getArea()+ " and perimeter= "+square1.getPerimeter());

        Line line = new Line(0,0,1,1);
        System.out.println("\n"+line+", |AB|= "+line.calculateLength());
        Point2D centerOfLine = line.getCenterPoint();
        System.out.println("The center of line: "+centerOfLine);

        Movable movable = new MovablePoint(0,0,2,1);
        System.out.println("\n"+movable);
        System.out.println("Move Down!");
        movable.moveDown();
        System.out.println(movable);
        System.out.println("Move Right!");
        movable.moveRigth();
        System.out.println(movable);
        System.out.println("Move Up!");
        movable.moveUp();
        System.out.println(movable);
        System.out.println("Move Left!");
        movable.moveLeft();
        System.out.println(movable);


        movable = new MovableCircle(0,0,2,3,2);
        System.out.println("\n"+movable);
        System.out.println("Move Down!");
        movable.moveDown();
        System.out.println(movable);
        System.out.println("Move Right!");
        movable.moveRigth();
        System.out.println(movable);
        System.out.println("Move Up!");
        movable.moveUp();
        System.out.println(movable);
        System.out.println("Move Left!");
        movable.moveLeft();
        System.out.println(movable);

        GeometricObject geometricObject = new Circle("Red",true,3);
        System.out.println("\n"+geometricObject+", Area= "+geometricObject.getArea()+
                ", Perimeter= "+geometricObject.getPerimeter());
        geometricObject = new Square("Blue",false,11);
        System.out.println(geometricObject+", Area= "+geometricObject.getArea()+
                ", Perimeter= "+geometricObject.getPerimeter());
        geometricObject = new Rectangle("Yellow",true,6,4);
        System.out.println(geometricObject+", Area= "+geometricObject.getArea()+
                ", Perimeter= "+geometricObject.getPerimeter());

        Resizable resizable = new ResizableCircle("Yellow",false,6);
        System.out.println("\n"+resizable);
        resizable.resize(20);
        System.out.println("Resize radius by 20%");
        System.out.println(resizable);






    }
}
