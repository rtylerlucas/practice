package productscraper;

public class Sanitizer {

    private Sanitizer(){}
    /*
     * Sanitize string of any commas or new lines!
     */
    public static String sanitize(String input){
        input.replace(",","");
        input.replace("n","");
        return input;
    }
}
