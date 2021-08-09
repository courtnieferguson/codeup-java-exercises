//asking user to enter count of strings they would like to enter for sorting
//once count is captured using scanner class, initialize string array of the input count size then run for loop to capture all strings input
//all strings stored in the string array , compared the first alpha of each string to get sorted

import java.util.Scanner;

public class SortAlpha {

    public static void main(String[] args)
    {
        int count;
        String temp;
        Scanner  scan = new Scanner(System.in);

        //user asked to enter count of strings
        System.out.print("Enter number of strings you would like to enter:");
        count = scan.nextInt();

        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        //user is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        //sorting the strings
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++){
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        //displaying the strings after sorting based on alpha
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(str[i] + ", ");

        }
    }
}
