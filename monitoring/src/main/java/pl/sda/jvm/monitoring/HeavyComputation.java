package pl.sda.jvm.monitoring;

import org.apache.commons.lang3.RandomUtils;

public class HeavyComputation {

    private final static int NUM_OF_ITERATION = 1000000;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        while (true) {
            long started = System.nanoTime();
            for(int i = 0; i < NUM_OF_ITERATION; i++) {
                Math.pow(RandomUtils.nextDouble(1, 10), -0.5);
            }
            System.out.println("Calculated in: " + (System.nanoTime() - started)/NUM_OF_ITERATION + " ns");
        }
    }
}
