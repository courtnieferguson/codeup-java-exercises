import java.util.Scanner;

public class MethodsExercises {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

          //Addition
//        System.out.println(4 == sum(3,1));
//        System.out.println(11 == sum(9,2));
//        System.out.println(12 == sum(10,2));
//
//        //Subtraction
//        System.out.println(4 == sub(10,6));
//        System.out.println(3 == sub(9,6));
//        System.out.println(7 == sub(12,5));
//
//        //Multiplication
//        System.out.println(8 == multi(2,4));
//        System.out.println(50 == multi(10,5));
//        System.out.println(81 == multi(9,9));
//
//        //Division
//        System.out.println(8 == div(80,10));
//        System.out.println(4 == div(40,10));
//        System.out.println(3 == div(30,10));




//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);


//        factorial();
        rollTheDice();
    }





    public static int getInteger(int min, int max){
        do{
//            System.out.print("Enter a number between 1 and 10: ");
            int userResponse = scanner.nextInt();
            if(userResponse > min && userResponse < max) {
                return userResponse;
            }
        }while(true);
    }

    public static void factorial(){
        int userInput = getInteger(1,10);
        long fact = 1; // basket
        for (int i = userInput; i > 0; i--) {
            fact*=i;
        }
        System.out.println(fact);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void rollTheDice(){
        System.out.println("Please enter a number of sides of the dice from 2 to 20");
        int NumberOfSides = getInteger(2,20);

        int firstRoll = getRandomNumber(1,NumberOfSides);
        int secondRoll = getRandomNumber(1,NumberOfSides);

        System.out.printf("First Die ===> %d\nSecond Die ===> %d\n",firstRoll,secondRoll);

        System.out.println("Continue? Type Y for yes and N for no");

        Scanner userInput = new Scanner(System.in);
        String usersResponse = userInput.nextLine();
        boolean doesUserWantToContinue = usersResponse.toLowerCase().contains("y");

        if(doesUserWantToContinue){
            rollTheDice();
        }
    }


    public static double sum(int num1, int num2){return num1 + num2;}

    public static double sub(int num1, int num2){return num1 - num2;}

    public static double multi(int num1, int num2){return num1 * num2;}

    public static double div(int num1, int num2){return num1 / num2;}
}

