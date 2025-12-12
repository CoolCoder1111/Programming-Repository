
package com.mycompany.shapesproj;

public class Triangle extends Shape {

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    
    public int side1;

    public int getSide1() {
        return side1;
    }

    public int side2;

    public int getSide2() {
        return side2;
    }

    public int side3;

    public int getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        int area;
        area = side1 * side2;
        area = area / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        int perimeter;
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

}
