package pl.art.tutorial.jvm;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class MBeanExample {

    public static void main(String[] args) throws Exception {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("pl.art.tutorial.jvm:type=SomeMBean");
        SomeMBean mbean = new Some();
        mbs.registerMBean(mbean, name);
        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }

    public interface SomeMBean {
        void println();

        int getValue();
    }

    static class Some implements SomeMBean {

        private int value;

        public void println() {
            System.out.println("hallo");
            value++;
        }

        public int getValue() {
            return value;
        }
    }
}



