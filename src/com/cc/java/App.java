package com.cc.java;

public class App {
    public static void main(String[] args) {
      // to do
    
      Test test = new Test("Grizabella", 29);
      ausgabe("Namen: " + test.getName());
      ausgabe("Age: " + test.getAge());

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
