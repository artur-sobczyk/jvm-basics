package pl.art.tutorial.jvm.exercises;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.Random;

@Slf4j
public class StackOverflowExample {

    static SecureRandom random = new SecureRandom();

    static int stackDepth = 0;

    public static void main(String... args) {
        testMethod();
    }

    private static void testMethod() {
        long i = random.nextLong();  // 6500
        long d = random.nextLong();  // 5500
        long c = random.nextLong();  // 5050
        log.info("stackDepth: " + stackDepth++);
        //sleep(10);
        testMethod();
    }

    private static void sleep(long mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
        }
    }
}
