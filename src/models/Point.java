package models;
public class Point {
    private double x;
    private double y;

    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }
    //getters for x and y

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    //constructor to set values for x and y
}