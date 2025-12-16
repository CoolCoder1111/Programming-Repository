
package com.mycompany.pong;

public class Paddle {
    public double x, y;
    public double width, height;

    public Paddle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public boolean collides(Ball b) {
        return (b.x + b.radius > x && b.x < x +  width &&
        b.y + b.radius > y && b.y < y + height);
    }
            
}
