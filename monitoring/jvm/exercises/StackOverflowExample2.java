package pl.art.tutorial.jvm.exercises;

public class StackOverflowExample2 {

    public static void main(String... args) {
        A a = new A();
        B b = new B();

        a.b = b;
        b.a = a;

        a.toString();
    }

    static class A {
        B b;

        @Override
        public String toString() {
            return "A{" + "b=" + b + '}';
        }
    }

    static class B {
        A a;

        @Override
        public String toString() {
            return "B{" + "a=" + a + '}';
        }
    }
}
