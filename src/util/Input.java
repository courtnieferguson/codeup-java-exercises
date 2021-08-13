package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    double getDouble(double min, double max) {
        System.out.println("Pick a number between 1 and 10");
        double userResponse = scanner.nextDouble();
        if(userResponse < min || userResponse > max) {
            System.out.println("Awesome! "  + userResponse + " is in range");
            return getDouble(min,max);
        } else{
            System.out.println("It's a valid decimal.");
            return userResponse;
        }
    }
    }

 //   public String getString() {
 //       String input = scanner.nextLine();
 //       return input;
 //   }
//
 //   public boolean yesNo() {
 //       String input = scanner.nextLine();
 //       if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
 //           return true;
//
 //       } else if  (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
 //           return false;
//
 //       } else {
//
 //           return yesNo();
 //       }
 //   }
//
 //   public int getInt() {
 //           System.out.println("Type a number.");
 //           int input = scanner.nextInt();
 //           System.out.println(input);
 //          return input;
 //      }

        public static void main(String[] args) {
    }

    public double getDouble(){

        System.out.println("Type a number 1 through 10:");
        double userResponse = scanner.nextDouble();
        return userResponse;
    }
}
