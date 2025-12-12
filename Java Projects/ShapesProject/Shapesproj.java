
package com.mycompany.shapesproj;

import java.util.ArrayList;

public class Shapesproj {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(new Triangle(200, 400, 600));
        shapes.add(new Triangle(50, 40, 30));
        shapes.add(new Circle(40));
        shapes.add(new Circle(50));
        shapes.add(new Rectangle(20, 100));
        shapes.add(new Rectangle(10, 60));
        
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
        
    }
}
