package pl.sda.jvm.monitoring;

import javax.management.MBeanServer;
import javax.management.ObjectInstance;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.Set;

public class ListAllJVMMBeans {

    public static void main(String[] args) {

        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        Set<ObjectInstance> instances = server.queryMBeans(null, null);
        Iterator<ObjectInstance> iterator = instances.iterator();

        while (iterator.hasNext()) {
            ObjectInstance instance = iterator.next();
            System.out.println("MBean Found:");
            System.out.println("Class Name:t" + instance.getClassName());
            System.out.println("Object Name:t" + instance.getObjectName());
            System.out.println("****************************************");
        }
    }
}
