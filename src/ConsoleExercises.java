

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;

   System.out.format("The value of pi is approximately: %1.2f", pi);

//    Scanner input = new Scanner(System.in);

//    System.out.println("Give me an integer!");
//    int userInt = scanner.nextInt();
//    System.out.println("You entered: " + userInt);

//    System.out.println("Enter three words, please.");

//    String firstWord = scanner.nextLine();
//    String secondWord = scanner.nextLine();
//    String thirdWord = scanner.nextLine();

//    System.out.println(firstWord);
//    System.out.println(secondWord);
//    System.out.println(thirdWord);

// System.out.println("Enter a sentence, please.");
//
// String userSentence = scanner.nextLine();
//
// System.out.println(userSentence);

//        System.out.print("\nEnter length Bellow\n");
//        String perimeter = scanner.nextLine();
//        double area = ((Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)));
////        System.out.printf("%s",Integer.parseInt(perimeter));
//        System.out.printf("%1.0f",area);
//
//        System.out.print("\nEnter length Bellow\n");
//        double volume = ((Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)));
////        System.out.printf("%s",Integer.parseInt(perimeter));
//        System.out.printf("%1.0f",volume);
////
////adding height
//        //area * height = volume
//
//        scanner.useDelimiter("\n");

        System.out.println("You will need to enter a length and width");
        System.out.println("Enter the width: ");

        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter a length: ");

        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = ((width * 2) + (length * 2));
        System.out.printf("\nArea: %.2s",area);
        System.out.printf("\nPerimeter: %.2s",perimeter);



    }
}

