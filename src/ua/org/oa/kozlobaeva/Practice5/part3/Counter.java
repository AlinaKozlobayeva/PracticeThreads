package ua.org.oa.kozlobaeva.Practice5.part3;

/**
 * Created by Alina on 16.06.2015.
 */
public class Counter {
    private volatile int count = 0;
    private int countLimit;

    public Counter(int countLimit) {
        this.countLimit = countLimit;
    }

    public int Counting1(){
        for (int i = 0; i < countLimit; i++) {
            count++;
        }
        return count;
    }

    public int Counting2(){
        for (int i = 0; i < countLimit; i++) {
            count++;
        }
        return count;
    }
}
