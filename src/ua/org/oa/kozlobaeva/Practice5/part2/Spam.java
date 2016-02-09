package ua.org.oa.kozlobaeva.Practice5.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Spam extends Thread {

    private List<Integer> time = new ArrayList();
    private List<String> message = new ArrayList();

    public Spam(List time, List message) {
        this.time = time;
        this.message = message;
    }

    @Override
    public void run() {
        for (int j = 0; j < message.size(); j++) {
            if (Thread.interrupted()) {
                break;
            }
            System.out.println("write a message: " + message.get(j) + "  and sleep: " + time.get(j));
            try {
                Thread.sleep(time.get(j));
            } catch (InterruptedException e) {
                System.out.println("You are stopped a thread");
                throw new RuntimeException();

            }
        }

    }



}
