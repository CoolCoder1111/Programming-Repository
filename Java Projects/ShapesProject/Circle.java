
package com.mycompany.shapesproj;

public class Circle extends Shape {

    public Circle(double radius) {
        this.radius = radius;
    }
    
     @Override
    public double getArea() {
        double area;
       area = Math.PI * Math.pow(radius, 2);
       Math.round(area);
       return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        Math.round(perimeter);
        return perimeter;
    }

    private final double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

   
}
