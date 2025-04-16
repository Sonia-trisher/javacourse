import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("what is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("are you student?(true/false) :");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello "+ name);
//        System.out.println("you are " + age + " years old");
//        System.out.println("you are gpa is : " + gpa );
//        System.out.println("student : "+ isStudent);
//
//        if(isStudent){
//            System.out.println("you are enrolled student");
//        }else{
//            System.out.println("you are NOT enrolled student");
//        }
//
//        scanner.close();
//        augmented Assignment Operator
        int x= 10;
        int y =2;
//           x += y;
//          x -= y;
//          x /=y;
//            x *=y;
           x%=y;

        System.out.println(x);


        Random random = new Random();
        double numbers = random.nextDouble();
        boolean isHeads = random.nextBoolean();
        System.out.println(isHeads);// if u want can use int or boolean
        System.out.println(numbers);
// math class
        double result;
        result = Math.pow(2,3);
        result = Math.abs(-7);
        result = Math.sqrt(81);
        result = Math.round(3.14);
        result = Math .ceil(3.14);
        result = Math .floor(3.14);
        result = Math.max(5,8);
        result = Math.min(5,8);
        System.out.println(result);
        System.out.println(Math.PI);
        System.out.println(Math.E);

    }
}
