package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

public Input() {
      this.scanner = new Scanner(System.in);
  }

  public static String getString() {
String userInput = scanner.nextLine();
return userInput;
}

public static boolean yesNo() {
    System.out.println("Do you know Java? type yes or no.");
    String userResponse = scanner.nextLine();
    if (userResponse.equals("yes") || userResponse.contains("y")) {
        return true;
    }else{
        return false;
    }
    }

public static int getInt(int min, int max) {
    System.out.println("pick a number between 1 and 10");
    int userResponse = scanner.nextInt();

    if (userResponse < min || userResponse > max) {
        System.out.println("great choice " + userResponse + " will work!");
        return getInt(min, max);
    } else {
        System.out.println("");
        return userResponse;
    }
}

public static int getInt() {
    System.out.println("Pick a number");
    String s = getString();
    try {
        return Integer.valueOf(s);
    } catch (NumberFormatException e) {
        System.out.println("Try Again");
        return getInt();
    }
}

    double getDouble(double min, double max) {

        System.out.println("Give an integer between 1-10:");
        double userResponse = scanner.nextDouble();
        if (userResponse < min || userResponse > max) {
            System.out.println("Yay! " + userResponse + " is within the range");
            return getDouble(min, max);
        } else {
            System.out.println("That's a valid decimal");
            return userResponse;
        }
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        String s = getString();
        try {
            return Double.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Try again!");
            return getDouble();
        }
    }

    public int getBinary() {
        System.out.println("Give a binary number");
        try {
            return Integer.valueOf(this.getString(), 2);
        } catch (NumberFormatException e) {
            System.out.println("That is not a binary number");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("Give a Hexadecimal number");
        try {
            return Integer.valueOf(this.getString(), 16);
        } catch (NumberFormatException e) {
            System.out.println("That is not a double!");
            return getHex();
        }
    }


}


