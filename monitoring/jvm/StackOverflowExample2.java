package pl.art.tutorial.jvm;

import lombok.ToString;

public class StackOverflowExample2 {

    private int stackDepth = 0;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.b = b;
        b.a = a;

        System.out.println(a.toString());
    }

    @ToString
    public static class A {
        private B b;
    }

    @ToString
    public static class B {
        private A a;
    }
}
