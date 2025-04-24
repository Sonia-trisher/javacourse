import java.util.Scanner;

public class nestedLoop {
//    nested loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of column:");
        int columns = scanner.nextInt();
        System.out.print("Enter the symbol to use:");
        char symbol = scanner.next().charAt(0) ;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}
