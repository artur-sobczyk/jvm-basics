package pl.art.tutorial.jvm;

/**
 * Class level description.
 *
 * @author asobczyk
 */
public class HelloWorld {

    /**
     * Filed description
     */
    public static final String MESSAGE = "Hello World!";

    /**
     * Method documentation.
     *
     * @param args invocation parameters
     */
    public static void main(String[] args) {
        new HelloWorld().print(MESSAGE);
    }

    /**
     * Methods that prints text to {@link System#out}
     *
     * @param message text to be printed
     *
     */
    public void print(String message) {
        System.out.println(message);
    }
}
