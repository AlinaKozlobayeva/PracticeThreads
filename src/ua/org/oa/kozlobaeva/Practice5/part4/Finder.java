package ua.org.oa.kozlobaeva.Practice5.part4;

/**
 * Created by Alina on 11.06.2015.
 */
public class Finder extends Thread {

    public void run(double[] row) {
        double max = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i]> max) {
                max = row[i];
                try {
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(max);
    }


}
