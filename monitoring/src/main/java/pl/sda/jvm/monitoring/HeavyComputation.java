package pl.sda.jvm.monitoring;

public class HeavyComputation {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        while(true){
            Math.pow(2, -100);
        }
    }
}
