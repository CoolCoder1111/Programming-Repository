
package com.mycompany.shapesproj;

abstract class Shape {
    
    protected String name;

    public String getName() {
        return name;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return  getName() + ":" + " " + "Area" + " " + getArea()+ " " + "Perimeter" + " " + getPerimeter();
    }
    
    
    
}
