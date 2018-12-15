package pl.sda.jvm.monitoring.complete;

public class LongRunningProgram {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        Thread.sleep(1000000);
        System.out.println("Finished");
    }
}
