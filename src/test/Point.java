/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package test;

/**
 * Created by lusai on 4/11/16.
 *
 * program 3.2
 *
 * a data type for points in the plane.
 */
public class Point {
    double x,y;

    Point() {
        x=Math.random();
        y=Math.random();
    }

    Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    double r() {
        return Math.sqrt(x * x + y * y);
    }

    double theta() {
        return Math.atan2(y, x);
    }

    double distance(Point p) {
        double dx=x-p.x,dy=y-p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "("+x+","+y+")";
    }

}
