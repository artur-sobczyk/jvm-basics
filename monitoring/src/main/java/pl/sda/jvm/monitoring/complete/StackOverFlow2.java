package pl.sda.jvm.monitoring.complete;

/**
 * Beans call each one recursively
 * - add toString and equals method
 */
public class StackOverFlow2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");

        A a = new A();
        B b = new B();

        a.b = b;
        b.a = a;

        a.test();
    }

    static class A {
        B b;

        void test() {
            b.test();
        }
    }

    static class B {
        A a;

        void test() {
            a.test();
        }
    }
}
