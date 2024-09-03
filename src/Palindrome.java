import java.util.Scanner;

public class Palindrome {
    public static void searchPalindrome () {
        boolean palindrome = false;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input some string to be checked as palindrome");

        String str = myObj.nextLine();
        int lenght = str.length();

        for (int i=0; i<lenght;i++) {
            if (str.charAt(i) != str.charAt(lenght - 1 - i)) {
                palindrome = false;
            } else palindrome = true;
        }
        System.out.println("The string is palindrome : " + palindrome);
    }
}