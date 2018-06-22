package pl.art.tutorial.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MemoryUsageExample {

    private static final Random RANDOM = new Random();
    private static final int NUM_OF_BYTES = 1000000;

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();

        while (true) {
            allocateLongMemory();
            //System.gc();
            list.add(getRandomBytes(NUM_OF_BYTES/100));
        }
    }

    private static void allocateLongMemory() {
        List<byte[]> list = new ArrayList<>();
        list.add(getRandomBytes(NUM_OF_BYTES));

        for (int i = 0; i < 10; i++) {
            allocateShortMemory();
        }
    }

    private static void allocateShortMemory() {
        List<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(getRandomBytes(NUM_OF_BYTES));
        }
    }

    private static byte[] getRandomBytes(int numberOfBytes) {
        byte[] bytes = new byte[numberOfBytes];
        RANDOM.nextBytes(bytes);
        return bytes;
    }
}
