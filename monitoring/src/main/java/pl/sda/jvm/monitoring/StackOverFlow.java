package pl.sda.jvm.monitoring;

public class StackOverFlow {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        method(0);
    }

    private static void method(int i) throws InterruptedException{
        System.out.println("depth: " + i);
        Thread.sleep(1);
        if(Thread.interrupted()){
            System.exit(-1);
        }
        method(++i);
    }
}
