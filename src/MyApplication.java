import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\untitled\\src\\source.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape(); //object created by class Shape
        while(sc.hasNext()) { //since  we have 5 sides, there will be 5 coordinates
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point(x, y);
            shape.addPoint(point); //using addPoint method to collect point in pointArrayList
        }
        shape.calculateDistance(); //using calculateDistance method to calculate sides and collect them in distanceArrayList
        System.out.println("Perimeter: "+shape.calculatePerimeter());
        System.out.println("Average size: "+shape.getAverageSize());
        System.out.println("Longest side: "+shape.getLongestSide());
    }
}