package pl.art.tutorial.jvm;

/**
 * Example class
 *
 * @author asobczyk
 */
public class HelloWorld {

    public static final String MESSAGE = "Hello World!";

    public static void main(String[] args) {
        new HelloWorld().print(MESSAGE);
    }

    /**
     * Methods that prints text to {@link System#out}
     *
     * @param message text to be printed
     */
    private void print(String message) {
        System.out.println(message);
    }
}
