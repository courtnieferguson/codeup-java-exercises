import java.util.Scanner;

public class ControlStatements {

    public static void main(String[] args) {

        String myName = "Earl";
        int age = 18;

        String someOneElseName = "Earl";

        System.out.println(myName.equals(someOneElseName));

        boolean isUserNamedEarlAndis18 = (myName.equals("Earl") && age >= 18);
        System.out.println("User meets the requirements is a " + isUserNamedEarlAndis18 + " statement");


        Scanner sc = new Scanner(System.in);
        String usersResponse = sc.nextLine();
        System.out.print("Would you like to continue?");
        boolean userRespondedWithYes = sc.nextLine().toLowerCase().contains("y");
        System.out.println(userRespondedWithYes);

        if (usersResponse.contains("YES")) {

            System.out.println("Ok");
        } else if(userRespondedWithYes) {
            System.out.println("Ok");
        } else {
            System.out.println("Ok, go on");
        }


    }

}