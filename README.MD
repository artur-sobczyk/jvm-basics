# JVM training
Purpose of this repository is to provide materials allowing understand basic JVM features. Below is a list of subjects. 

### precondition:
- installed jdk
- `JAVA_HOME` is set in system environment variables
- `%JAVA_HOME/bin%` is added to `PATH` system environment variable - without it java commandline utils may not be visible in terminal
- in console/terminal try `javac` if do not working something is wrong :(
- check version of java to confirm that you use desired one
- check project setting in IntellijJ that you use desired one

### notes:
- examples are prepared to be run in windows, to start them on linux there maybe required some changes with slashes and replacement of ":" to ";" in class path values

# 1.1. Class loading
- Write program that will show sequence of loading and initialization of classes using static initializer section and constructors.
- For this purpose create three classes `ClassB`, `ClassA` and `Main`. Each class should have static initialization block, moreover `ClassA` should extend `ClassB`. Instantiate `ClassA` in `Main` class main method. 
- Both static initialization block and constructors should print suitable message to console to make it possible to track loading and execution sequence.

# 1.2. Class compilation
`cd compiling` - go to submodule in terminal (git bash or intelliJ)

`javac -d dist src\main\java\HelloWorld.java` - compile class and put it in dist directory

`java -cp dist HelloWorld` - set class path to dist folder and run class

`javap -v dist/HelloWorld.class` - shows generated byte code with details (look at the same code in IntelliJ)

`javac -cp lib\commons-lang3-3.8.1.jar -d dist src\main\java\HelloWorld.java` - compile class with dependency to library and put it in dist directory

`java -cp dist;lib\commons-lang3-3.8.1.jar HelloWorld` - set class path to dist folder and library , then run class

# 1.3. Jar building
`jar -cf simple-compile.jar -C dist .` - builds jar with all files in dist

`jar -tf simple-compile.jar` - list content of jar

`java -cp simple-compile.jar HelloWorld` - run class from jar

# 1.4. Jar building with MANIFEST

`jar -cfe simple-compile.jar HelloWorld -C dist .` - builds jar with all files in dist and Manifest that include main class

`jar -cfm simple-compile.jar etc\MANIFEST.MF -C dist .` - builds jar with all files in dist and custom Manifest that include main class and class path

`java -jar simple-compile.jar` - run class configured in manifest

# 1.5. Class compilation with lombok (annotation processing)
- reduce boilerplate code with lombok https://projectlombok.org/contributing/lombok-execution-path
- Intellij needs "Lombok Plugin", and "annotation processing" enabled by compiler

`javac -cp lib\lombok.jar -d dist src\main\java\HelloWorld.java` - compiles class with lombok compile time preprocessor

# 1.6. Run in debug mode
- add remote debug config in IntellijJ
- set brake point in HelloWorld class
- `java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=1044 -cp dist HelloWorld` - runs application in debug mode waiting for debugger

# 2.1 Blow Stack with StackOverflowError
- write program with method that recursively call itself (StackOverflow)
- write program with two object that call each other recursively (StackOverflow2)

# 2.2. Blow Heap with OutOfMemoryError
- write program that will reserve all heap memory - by collecting large objects in list

_node: java there are possible memory leaks when objects references are stored in some application scope collection._

# 3. Monitoring
- `java -X help` - jvm options
- commandline tools:
    - jshell
    - jps
    - jinfo
    - jstack
- jvisualvm 
    - https://visualvm.github.io/download.html
    - unpack and install all plugins
    - `-Xmx100m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./java_pid.hprof` - heap dump on error
    - `-XX:+UnlockCommercialFeatures -XX:+FlightRecorder` - profiling
- play with memory:
    - -Xmx10m
    - -Xmx1g
- play garbage collectors:
    - -XX:+UseSerialGC
    - -XX:+USeParNewGC
    - -XX:+UseG1GC
- see MBean in action
    
# JVM useful resources
- https://www.baeldung.com/jvm-parameters
- https://www.baeldung.com/graal-java-jit-compiler
- https://www.baeldung.com/jvm-garbage-collectors
- https://bottega.com.pl/pdf/materialy/jvm/jvm1.pdf
- https://bottega.com.pl/pdf/materialy/jvm/jvm2.pdf
- https://blog.sokolenko.me/2014/11/javavm-options-production.html
- https://www.baeldung.com/java-management-extensions
- https://raygun.com/blog/java-performance-optimization-tips/

 