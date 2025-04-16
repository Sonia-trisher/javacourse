import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {
//        shopping CART PROGRAM
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.print("what item would you like to buy? :");
        item = scanner.nextLine();

        System.out.print("what is price for each? :");
        price = scanner.nextDouble();

        System.out.print("how many would you like? :");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\n you have bought "+ quantity+ " " + item +"/s" );
        System.out.println("your total is " +currency+ total);
        scanner.close();
    }
}
