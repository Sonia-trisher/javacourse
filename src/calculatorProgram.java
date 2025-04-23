import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        String operator;
        double result =0;
        boolean validOperator = true;
        System.out.print("Enter the first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter the Operator (+,-,/,*,^): ");
        operator = scanner.next();
        System.out.print("Enter the second number:");
        num2 = scanner.nextDouble();
        switch(operator) {
            case "+"-> result = num1 + num2;
            case "-"-> result = num1 - num2;
            case "/"-> {
                if(num2 ==0){
                    System.out.println("Cannot divide by zero: error");
                    validOperator = false;
                }
                else{
                    result = num1 /num2;
                }
            }

            case "*"-> result = num1 * num2;
            case "^"-> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperator = false;
            }
        }
        if(validOperator) {
            System.out.println(result);

        }


        scanner.close();

    }
}
