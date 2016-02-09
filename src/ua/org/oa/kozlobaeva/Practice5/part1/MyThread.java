package ua.org.oa.kozlobaeva.Practice5.part1;

/**
 * Created by Alinka on 24.05.2015.
 */
public class MyThread implements Runnable {

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("my name Thread 1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("smth wrong!");
            }
        }
    }
}
