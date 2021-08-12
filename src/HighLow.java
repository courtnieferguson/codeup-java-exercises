import java.util.Scanner;

public class HighLow {

    public static int randomNum() {
        return (int) (Math.random() * 99) + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 100");
        int guessedTimes = 0;
        int numberCorrect = randomNum();
        int enteredGuess = 0;
        do {
            System.out.println("Enter the number you guessed");
            enteredGuess = scanner.nextInt();
            if (enteredGuess >= 1 && enteredGuess <= 100) {
                if (enteredGuess < numberCorrect) {
                    System.out.println("higher!");
                    guessedTimes++;
                    System.out.println("Attempts: " + guessedTimes);

                }
                if (enteredGuess > numberCorrect) {
                    System.out.println("lower!");
                    guessedTimes++;
                    System.out.println("Attempts: " + guessedTimes);

                }
            }
        } while (enteredGuess != numberCorrect);
        System.out.println("Excellent guess!");
    }
}
