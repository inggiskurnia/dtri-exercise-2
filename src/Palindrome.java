public class Palindrome {
    public static void searchPalindrome (String str) {
        boolean palindrome = false;
        int lenght = str.length();

        for (int i=0; i<lenght;i++) {
            if (str.charAt(i) != str.charAt(lenght - 1 - i)) {
                palindrome = false;
            } else palindrome = true;
        }
        System.out.println("The string is palindrome : " + palindrome);
    }
}
