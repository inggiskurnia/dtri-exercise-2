public class SearchString {
    public static void removeString (String original, String remove) {

        String modifiedString = original.replace(remove, "");

        System.out.println(modifiedString);
    }
}
