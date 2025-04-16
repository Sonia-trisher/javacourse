import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // area of rectangle
//        double width = 0;
//        double height = 0;
//        double area = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the width : ");
//        width = scanner.nextDouble();
//
//        System.out.println("Enter the height : ");
//        height = scanner.nextDouble();
//
//        area = width * height;
//        System.out.println("Area of rectangle is: " + area + "cm^2");
//        scanner.close();
//        circumference = 2*Math.PI * radius;
//        area = Math.PI * Math.pow(radius,2);
//        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        Scanner scanner2 = new Scanner(System.in);
         double radius;
         double circumference;
         double  area2;
         double  volume;
         System.out.print("Enter the radius : ");
         radius = scanner2.nextDouble();

         circumference = 2 *Math.PI* radius;
        System.out.println("The area of the circle is: " + circumference + "cm");

        area2 = Math.PI * Math.pow(radius,2);
        System.out.println("The area is : "+area2 +"cm^2");

        volume = Math.PI * Math.pow(radius,3);
        System.out.printf("The volume is : %.1fcm^3",volume );




    }
}
