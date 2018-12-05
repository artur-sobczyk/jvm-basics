package pl.art.tutorial.jvm;

import com.google.common.math.BigIntegerMath;

import java.util.Random;

// -Xverify:none
public class PerformanceExample {

    private static Random random = new Random();

    public static long add() {
        return random.nextLong() + random.nextLong();
    }

    public static long multiply() {
        return random.nextLong() + random.nextLong();
    }

    public static double power() {
        return Math.pow(random.nextLong(), random.nextLong());
    }

    public static class A {

        void fractional(){
            BigIntegerMath.factorial(random.nextInt(1000));
        }
    }

    public static void main(String... args){
        while(true){
            add();
            multiply();
            power();

            new A().fractional();
        }
    }


}
