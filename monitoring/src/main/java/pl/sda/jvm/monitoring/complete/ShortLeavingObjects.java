package pl.sda.jvm.monitoring.complete;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShortLeavingObjects {

    private static final int OBJECT_SIZE_IN_BYTES = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");

        for (int i = 0; i < 100000; i++) {

            getObject();
            if (Thread.interrupted()) {
                System.exit(-1);
            }
            Thread.sleep(100);
        }
        System.out.println("Finished");
    }

    private static byte[] getObject() {
        byte[] byteArray = new byte[OBJECT_SIZE_IN_BYTES];
        new Random(System.currentTimeMillis()).nextBytes(byteArray);
        return byteArray;
    }

    private static List getComplicatedObject() {
        List<Object> list = new ArrayList<>();
        list.add(getObject());

        for (int i = 0; i < 100; i++) {
            List<Object> list1 = new ArrayList<>();
            list.add(list1);
            list1.add(list);
            list = list1;
        }
        return list;
    }
}
