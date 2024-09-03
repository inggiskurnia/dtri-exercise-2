import java.util.Scanner;

public class Distance {
    public static void centimeterToKilometer () {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter length in cm");

        double cm = myObj.nextDouble();
        double km = cm / 100000;

        System.out.println("The converted distance is " + km + " kilometer");
    }
}
