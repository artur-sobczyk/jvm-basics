package pl.sda.jvm.monitoring.complete;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

// -Xmx1g
// -XX:+HeapDumpOnOutOfMemoryError
// -XX:HeapDumpPath=./heap_dump.hprof
public class OutOfMemory {

    private final static int MB =  1024*1024;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");
        List<TestClass> bytes = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {

            bytes.add(new TestClass());

            if(Thread.interrupted()){
                System.exit(-1);
            }
            Thread.sleep(300);
            System.out.println("Heap size: " +
                    (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / MB + " MB");
        }
        System.out.println("Finished");
    }

    static class TestClass {
        String field = RandomStringUtils.random(MB);
    }
}
