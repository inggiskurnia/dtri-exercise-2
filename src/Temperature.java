import java.util.Scanner;

public class Temperature {
    public static void fahrenheitToCelcius () {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit");
        double fahrenheit = myObj.nextDouble();

        double celcius = (fahrenheit - 32) * 5/9;
        System.out.println("The converted temperature is " + celcius + " degree celcius");
    }
}
