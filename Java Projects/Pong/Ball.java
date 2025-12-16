
package com.mycompany.pong;

public class Ball {
    public double x, y;
    public double radius;
    public int xSpeed, ySpeed;

    public Ball(double x, double y, double radius, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void reset(double x, double y) {
        this.x = x;
        this.y = y;
        this.xSpeed = Math.random() < 0.5 ? 1: -1;
        this.ySpeed = Math.random() < 0.5 ? 1: -1;
    }
    
    public void update() {
        x += xSpeed;
        y += ySpeed;
    }
    public void bounceX() {
        xSpeed *= -1;
    }
    public void bounceY() {
        ySpeed *= -1;
    }
    
}
