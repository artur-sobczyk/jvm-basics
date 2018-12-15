package pl.sda.jvm.monitoring.complete;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class MBeanExample {

    public static void main(String[] args) throws Exception {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        ObjectName name = new ObjectName("pl.sda.jvm.monitoring:type=TestMBean");
        TestMBean mbean = new Test();
        mbs.registerMBean(mbean, name);

        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }

    public interface TestMBean {
        void printHello();

        int getPrintHalloInvocationNumber();
    }

    static class Test implements TestMBean {

        private int value;

        public void printHello() {
            System.out.println("Hello " + value);
            value++;
        }

        public int getPrintHalloInvocationNumber() {
            return value;
        }
    }
}



