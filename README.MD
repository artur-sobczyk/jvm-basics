#description
Purpose of this repository is to share instructions with source code related to jvm basics training.

#excercises monitoring:
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
   
   call both methods using jvisualvm.
 