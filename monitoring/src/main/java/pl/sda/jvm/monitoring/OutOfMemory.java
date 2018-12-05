package pl.sda.jvm.monitoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemory {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        List<byte[]> bytes = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            byte[] byteArray = new byte[1024 * 1024];
            new Random(System.currentTimeMillis()).nextBytes(byteArray);
            bytes.add(byteArray);

            if(Thread.interrupted()){
                System.exit(-1);
            }
            Thread.sleep(100);
        }
        System.out.println("Finished");
    }
}
