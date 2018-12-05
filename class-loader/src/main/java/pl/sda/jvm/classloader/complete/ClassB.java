package pl.sda.jvm.classloader.complete;

public class ClassB {
    static {
        System.out.println("ClassB loaded");
    }

    public ClassB() {
        System.out.println("ClassB instantiated");
    }
}
