package pl.art.tutorial.jvm.exercises;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class StartThreadsInLoop {

    private static Random r = new Random();

    public static void main(String... args) {
        for (int i = 0; i < 200; i++) {
            startThread();
        }
    }

    private static void startThread() {
        log.info("startThread");
        Thread t = new Thread(() -> {

            long time = System.currentTimeMillis();
            log.info("name " + Thread.currentThread().getName());
            for (int i = 0; i < 1000000; i++) {
                Math.pow(r.nextDouble(), r.nextDouble());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            log.info("took: " + (System.currentTimeMillis() - time) + " ms");
        });
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
