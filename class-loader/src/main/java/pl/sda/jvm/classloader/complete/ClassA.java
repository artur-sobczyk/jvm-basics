package pl.sda.jvm.classloader.complete;

public class ClassA extends ClassB {
    static {
        System.out.println("ClassA loaded");
    }

    public ClassA() {
        System.out.println("ClassA instantiated");
    }
}
