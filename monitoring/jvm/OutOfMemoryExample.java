package pl.art.tutorial.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemoryExample {

    private static final Random RANDOM = new Random();
    private static final int NUM_OF_BYTES = 1000000;

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();

        while (true) {
            list.add(getRandomBytes(NUM_OF_BYTES));
            printHeapSize();
        }
    }

    private static byte[] getRandomBytes(int numberOfBytes) {
        byte[] bytes = new byte[numberOfBytes];
        RANDOM.nextBytes(bytes);
        return bytes;
    }

    private static void printHeapSize(){
        System.out.println("heapSize = " + Runtime.getRuntime().totalMemory());
    }
}
