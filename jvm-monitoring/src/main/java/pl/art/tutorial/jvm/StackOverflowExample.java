package pl.art.tutorial.jvm;

public class StackOverflowExample {

    private int stackDepth = 0;

    public static void main(String[] args) {
        new StackOverflowExample().someMethod();
    }

    private void someMethod() {
        System.out.println("stackDepth = " + stackDepth++);
        someMethod();
    }
}
