
package com.mycompany.shapesproj;

public class Rectangle extends Shape {
    
     public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
        public int length;

    public int getLength() {
        return length;
    }

    public int width;

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        int area;
        area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        int perimeter;
        
        width = width * 2;
        length = length * 2;
        
        perimeter = length * width;
        return perimeter;
    }

     @Override
    public String getName() {
        return "Rectangle";
    }

   

}
