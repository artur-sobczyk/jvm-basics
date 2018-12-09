package pl.sda.jvm.monitoring;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShortLeavingObjects {

    private static final int OBJECT_SIZE_IN_BYTES = 1024 * 1024 * 50;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        List l = new ArrayList();

        for (int i = 0; i < 10000; i++) {

            l = Collections.unmodifiableList(getComplicatedObject());

            if (Thread.interrupted()) {
                System.exit(-1);
            }
            Thread.sleep(100);
        }
        System.out.println("Finished");

        l.clear();
    }

    private static byte[] getObject() {
        byte[] byteArray = new byte[OBJECT_SIZE_IN_BYTES];
        new Random(System.currentTimeMillis()).nextBytes(byteArray);
        return byteArray;
    }

    private static List getComplicatedObject() {
        List<Object> list = new ArrayList<>();
        list.add(getObject());
        List<Object> list2 = new ArrayList<>();
        list2.add(getObject());
        list.add(Collections.unmodifiableList(list2));
        list2.add(Collections.unmodifiableList(list));
        return list2;
    }
}
