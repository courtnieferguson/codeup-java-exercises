//User would provide the length and width values during execution of the program and the area would be calculated based on the provided values.

/**
 * @author: BeginnersBook.com
 * @description: Program to Calculate Area of rectangle
 */
import java.util.Scanner;
class AreaOfRectangle {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of Rectangle:");
        double width = scanner.nextDouble();
        //Area = length*width;
        double area = length*width;
        System.out.println("Area of Rectangle is:"+area);
    }
}

//In the above program, user would be asked to provide the length and width values.
// If you do not need user interaction and simply want to specify the values in program, refer the below program.
/**
 * class AreaOfRectangle2 {
 *    public static void main (String[] args)
 *    {
 * 	   double length = 4.5;
 * 	   double width = 8.0;
 * 	   double area = length*width;
 * 	   System.out.println("Area of Rectangle is:"+area);
 *    }
 * }
 */