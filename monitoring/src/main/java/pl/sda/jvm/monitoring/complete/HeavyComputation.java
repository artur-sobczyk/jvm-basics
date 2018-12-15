package pl.sda.jvm.monitoring.complete;

import org.apache.commons.lang3.RandomUtils;

// -XX:+UnlockCommercialFeatures -XX:+FlightRecorder
public class HeavyComputation {

    private final static int NUM_OF_ITERATION = 1000000;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        while (true) {
            long started = System.nanoTime();
            for (int i = 0; i < NUM_OF_ITERATION; i++) {
//                power(RandomUtils.nextDouble(1, 10), -0.5);
//                division(RandomUtils.nextDouble(1, 10), -0.5);
//                sum(RandomUtils.nextDouble(1, 10), -0.5);
                stringConcat();
                stringFormat();
            }
            System.out.println("Calculated in: " + (System.nanoTime() - started) / NUM_OF_ITERATION + " ns");
        }
    }

    private static double power(double a, double b) {
        return Math.pow(a, b);
    }

    private static double division(double a, double b) {
        return a / b;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    public static String stringFormat() {
        String foo = "foo";
        String formattedString = String.format("%s = %d", foo, RandomUtils.nextInt(1, 10));

        return formattedString;
    }

    public static String stringConcat() {
        String foo = "foo";
        String concattedString = foo + " = " + RandomUtils.nextInt(1, 10);

        return concattedString;
    }
}
