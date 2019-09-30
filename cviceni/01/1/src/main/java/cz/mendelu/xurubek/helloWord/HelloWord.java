package cz.mendelu.xurubek.helloWord;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class HelloWord {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello Word");
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
