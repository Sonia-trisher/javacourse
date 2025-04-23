import java.util.Scanner;

public class LogicOperator {
//    && = And
//    || = or
// != not

    public static void main(String[] args) {
        double temp = 22;
        boolean isSunny = false ;
        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good ");
            System.out.println("it is SUNNY outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("it is CLOUDY outside");
        }
        else if (temp > 30 || temp < 0){
            System.out.println("The weather is Bad");
        }
//        username must be between 4-12 characters
//        username must not contain space or underscopes

        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Please enter your username: ");
        username = scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("Username must be between 4 and 12 characters");
        }
        else if(username.contains(" ")|| username.contains("-")){
            System.out.println("Username not  contains spaces or underscore");
        }
        else{
            System.out.println("welcome "+username);
        }

        scanner.close();
    }
}
