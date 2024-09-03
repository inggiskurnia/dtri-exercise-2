import java.util.Scanner;

public class SearchString {
    public static void removeString () {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter some words");
        String original = myObj.nextLine();

        System.out.println("Enter some character to be remove from words");
        String remove = myObj.nextLine();

        String modifiedString = original.replace(remove, "");

        System.out.println(modifiedString);
    }
}
