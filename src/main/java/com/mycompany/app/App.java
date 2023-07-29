package com.mycompany.app;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
          try {
            while (true) {
                TimeUnit.SECONDS.sleep(1);
            }
        } catch(java.lang.InterruptedException e) {
        }
    }

    public String getMessage() {
        return MESSAGE;
    }
}
