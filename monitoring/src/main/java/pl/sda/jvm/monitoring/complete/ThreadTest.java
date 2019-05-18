package pl.sda.jvm.monitoring.complete;

import lombok.SneakyThrows;
import org.apache.commons.lang3.RandomUtils;

public class ThreadTest {

    @SneakyThrows
    public static void main(String[] args) {
        Thread.sleep(10000);

        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                @SneakyThrows
                public void run() {
                    System.out.println(Thread.currentThread().getId() + " Started");
                    for (int i = 0; i < 1000000; i++) {
                        stringFormat();
                    }
                    System.out.println(Thread.currentThread().getId() + " Finished");
                }
            }).start();

            Thread.sleep(1000);
        }
    }

    public static String stringFormat() {
        String foo = "foo";
        String formattedString = String.format("%s = %d", foo, RandomUtils.nextInt(1, 10));

        return formattedString;
    }
}
