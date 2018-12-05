package pl.art.tutorial.jvm;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public class HelloWorldWithLogger {

    public static void main(String[] args) {
        new HelloWorldWithLogger().print();
    }

    private void print() {
        log.info("Hello World!");
    }
}