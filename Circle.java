import java.util.Scanner;

public class Circle {   
    double radius;
    final double PI = 3.14159; 

    Circle(double newRadius)
    {
        radius = newRadius;
    }
       
    double getArea() {   
        return radius * radius * PI;   
    }     

    public static void main(String [] args){

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the radius of circle: ");
      double newRadius = input.nextDouble(); 
      input.close();
      Circle circle1 = new Circle(newRadius);
      System.out.println("The area for the circle of radius " + circle1.radius + " is " + circle1.getArea());
    }
}