package pl.art.tutorial.jvm.exercises;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
public class AllocateMemoryInLoop {

    private static List<String> list = new ArrayList<>();
    private static int SIZE_IN_BYTES = 1024 * 1024*100;
    private static int SIZE_IN_BYTES_MB = 1024 * 1024;
    private static Random r = new Random();

    public static void main(String... args) {

        log.info("start");

        while (true) {
            byte[] bytes = new byte[SIZE_IN_BYTES];
            r.nextBytes(bytes);

            byte[] bytes1 = new byte[SIZE_IN_BYTES_MB];
            r.nextBytes(bytes1);
            list.add(new String(bytes1));

            sleep(100);
        }
    }

    private static void sleep(long mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
        }
    }
}
