# This project show java tools from perspective of InteliJ

## generate documentation from code
javadoc -sourcepath src/main/java -d target/javadoc pl.art.tutorial.jvm

## excercises monitoring:
install all available plugins to jvisualvm

1. Write program with infinite loop and observe its behaviour in jvisualvm
2. Write program that starts threads with sleep for 100ms in loop and observe its behaviour in jvisualvm
3. Write program that in infinite loop allocates temporal new objects and start it 
   - with different GC
   - different Xmx values
   
   see: http://www.baeldung.com/jvm-garbage-collectors
   
4. Create object A and B, A is field of B and B is a field of A. Both objects should implement 
   toString() that calls its property toString() in main program just call toString() on one 
   of those objects and observe what will happen.
5. Do the same with hashcode method.
6. create MBean with two method. First should return some String other should print String to System.out

   see: https://docs.oracle.com/javase/tutorial/jmx/mbeans/standard.html
   
   call method using jvisualvm. and observe other value.
   
7. create class with three methods:
   - adding random doubles
   - multiplying random doubles
   - power of doubles
   
   run them in loop and observe execution time in jvisualvm.