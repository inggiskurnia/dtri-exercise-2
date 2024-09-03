public class Number {
    public static void findOddEven (int number) {
        boolean oddEven;

        if (number % 2 == 0) {
            oddEven = true;
        } else {
            oddEven = false;
        }

        System.out.println("The number is even : " + oddEven);
    }
}
