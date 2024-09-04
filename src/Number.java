import java.util.Scanner;

public class Number {
    public static void findOddEven () {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number to find odd or even");
        int number = myObj.nextInt();

        System.out.println("The number is even : " + (number % 2 == 0));
        System.out.println("test");
    }
}
