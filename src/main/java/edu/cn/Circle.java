package edu.cn;

/**
 * @program First
 * @description:
 * @author:
 * @create:2019-09-17 11:02:05
 **/

public class Circle {
    private int radius;
    private Point center;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw(){
        System.out.println("Draw a circle with the" +
                "center " + this.center.getX() +
                " " + this.center.getY() + " the radius is " +
            this.radius);
    }
}

