/**
 * - when referenced clas is loaded
 */
public class HelloWorld {

    private static final String MESSAGE = "Hello World";

    public static void main(String... args) throws Exception {
        System.out.println(MESSAGE);

        // other class is loded when it is used first time.
        //System.out.println(StringUtils.upperCase(MESSAGE));
    }
}