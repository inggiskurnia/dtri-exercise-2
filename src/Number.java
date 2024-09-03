import java.util.Scanner;

public class Number {
    public static void findOddEven () {
        boolean oddEven;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number to find odd or even");
        int number = myObj.nextInt();

        if (number % 2 == 0) {
            oddEven = true;
        } else {
            oddEven = false;
        }

        System.out.println("The number is even : " + oddEven);
    }
}
