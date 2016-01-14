package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App {
    public static void main(String[] args) {
        int i;
        RandomNameGenerator rnd = new RandomNameGenerator(5);
        for (i = 1; i <= 15; i++) {
            String name = rnd.next();
            System.out.println("Hello, " + name);
        }
    }
}
