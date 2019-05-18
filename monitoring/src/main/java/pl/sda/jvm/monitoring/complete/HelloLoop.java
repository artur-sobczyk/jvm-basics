package pl.sda.jvm.monitoring.complete;

public class HelloLoop {

    private static int index = 0;

    public static void main(String[] args) throws Exception {
        while(true){
            m();
        }
    }

    private static void m() throws Exception{
        System.out.println(index++);
        Thread.sleep(500);
    }
}
