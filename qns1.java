import java.util.*;

public class qns1 {
    public static void main(String[] args) {
        double pi = 3.14159; 
        System.out.println("What is the radius of your circle");
        Scanner scan = new Scanner(System.in);
        Double radius = scan.nextDouble();
        System.out.println("The area for the circle of the radius is " + radius + " and the area is " + radius*radius*pi);
    }
}