package pl.sda.jvm.classloader.complete;

public class Main {
    static {
        System.out.println("Main static loaded");
    }

    public static void main(String[] args) {
        System.out.println("Main.main()");
        new ClassA();
    }
}
