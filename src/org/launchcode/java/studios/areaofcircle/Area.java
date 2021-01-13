package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        String radius = input.nextLine();
        double area = Double.parseDouble(radius);
        double pie= 3.14;
        System.out.println(Circle.getArea(area));
    }
}