import java.util.Scanner;

public class rightTriangleAngle {
    public static void main(String[] args) {
//        HYPOTHENUSE C= Math(a^2 + b^2);

        Scanner scanner = new Scanner(System.in);
         double a;
         double b;
         double c;
        System.out.print("Enter a : ");
        a = scanner.nextDouble();
        System.out.print("Enter b : ");
        b = scanner.nextDouble();

        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The area of the triangle is: " + c + "cm");


        scanner.close();
    }
}
