package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointArrayList=new ArrayList<>(); //container of x,y coordinates
    private ArrayList<Double> distanceArrayList=new ArrayList<>(); //container of distance between two coordinates
    private double perimeter;
    private double averageSize;
    public void addDistance(double distance){
        distanceArrayList.add(distance);
    }
    public ArrayList<Point> getPointArrayList() {
        return pointArrayList;
    }
    public void addPoint(Point point){
        pointArrayList.add(point);
    }
    public void calculateDistance(){
        for (int  i=0;i<pointArrayList.size();i++){
            if (i+1==pointArrayList.size()){ // in this case side will be between last and first coordinates
                Point point=pointArrayList.getLast();
                Point nextPoint=pointArrayList.getFirst();
                double distance=Math.sqrt(Math.pow(nextPoint.getX()-point.getX(),2)+Math.pow(nextPoint.getY()-point.getY(),2)); //formula for calculation size between two points
                 addDistance(distance); //using method addDistance to collect size of every side
            }
            else{ // in this case side will be between to neighbor coordinates
                Point point=pointArrayList.get(i);
                Point nextPoint=pointArrayList.get(i+1);
                double distance=Math.sqrt(Math.pow(nextPoint.getX()-point.getX(),2)+Math.pow(nextPoint.getY()-point.getY(),2));
                addDistance(distance);
            }
        }
    }
    // calculatePerimeter()
    public double calculatePerimeter(){
        for(double distance:distanceArrayList){ //adding every side to find perimeter
            perimeter+=distance;
        }
        return perimeter;
    }
    // getAverageSide()
    public double getAverageSize(){
        averageSize=perimeter/5;
        return averageSize;
    }
    // getLongestSide()
    private double longestSize=0; //longest is 0, because its the min possible size
    public double getLongestSide(){
        for(double distance:distanceArrayList){
            if(distance>longestSize){ //every iteration we check if this side longer than previous
                longestSize=distance; //and updating if it is longer
            }
        }
        return longestSize;
    }
}