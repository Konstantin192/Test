package triangles;

import java.util.*;

public class Triangles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b ,c ;
        
        System.out.println("Enter the first side of a general triangle, the sum of the first two sides should be greater than the third one: ");
        a = input.nextDouble();
        System.out.println("Enter the second side of a general triangle, the sum of the first two sides should be greater than the third one: ");
        b = input.nextDouble();
        System.out.println("Enter the third side of a general triangle: ");
        c = input.nextDouble();
        Triangle triangleGeneral = new Triangle(a, b, c);
        
        System.out.println("Area of the general triangle is " + triangleGeneral.area());
        System.out.println("Perimeter of the general triangle is " + triangleGeneral.perimeter());
        
        System.out.println("Enter the first side of a right triangle: ");
        a = input.nextDouble();
        System.out.println("Enter he second side of a right triangle: ");
        b = input.nextDouble();
        Triangle triangleRight = new Triangle(a, b);
        
        System.out.println("Area of the right triangle is " + triangleRight.area());
        System.out.println("Perimeter of the right triangle is " + triangleRight.perimeter());
        
        System.out.println("Enter the side of an equilateral triangle: ");
        a = input.nextDouble();
        Triangle triangleEquilateral = new Triangle(a);
        
        System.out.println("Area of the equilateral triangle is " + triangleEquilateral.area());
        System.out.println("Perimeter of the equilateral triangle is " + triangleEquilateral.perimeter());
    }
    
}
