import java.util.Scanner;

public class Palindrome {
    public static void searchPalindrome () {
        boolean palindrome = false;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input some string to be checked as palindrome");

        String str = myObj.nextLine();
        int length = str.length();

        for (int i=0; i<length;i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                palindrome = false;
            } else palindrome = true;
        }
        System.out.println("The string is palindrome : " + palindrome);

        System.out.println("test print");
    }
}