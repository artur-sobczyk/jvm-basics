# is java installed
java -version

# is JAVA_HOME defined
echo $JAVA_HOME

# build class
javac HelloWorld.java
javac -verbose HelloWorld.java

# see byte code
javap -v HelloWorld.class

# run class
java HelloWorld

# build jar
jar -cf simple-compile.jar HelloWorld.class
jar -tf simple-compile.jar

# run class from jar
java -cp simple-compile.jar HelloWorld

# build jar with manifest (new line at the end of manifest file)
jar -cvfm simple-compile.jar MANIFEST.MF HelloWorld.class

# run jar
java -jar simple-compile.jar