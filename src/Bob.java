import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob.");
        String userInput = scanner.nextLine().trim();
        if(userInput.endsWith("?")){
            System.out.println("Sure");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(userInput.isEmpty()){
            System.out.println("Fine, Be thay way!");
        }else {
            System.out.println("Whatever.");
        }

    }
}
