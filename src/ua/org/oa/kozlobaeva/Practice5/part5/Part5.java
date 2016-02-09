package ua.org.oa.kozlobaeva.Practice5.part5;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
/**
 * Note!!! Without synchronization this application not work properly!! Most
 * likely a runtime exception will be thrown..
 * 
 */
public class Part5 {
	
	private static final Object MONITOR = new Object();	
 
    private static final int ITERATION_NUMBER = 3;
 
    private static final int READERS_NUMBER = 3;
 
    // shared resource (not thread-safe!!!)
    private static final StringBuilder BUFFER = new StringBuilder();
 
    private static final int BUFFER_LENGTH = 5;
 
    // speed parameter
    private static final int PAUSE = 50;
 
    // stop signal
    private static boolean stop = false;
 
    // reader
    private static class Reader extends Thread {
        public void run() {
            while (!stop) {
                try {
                	
                	synchronized (MONITOR) {
                	
                    // read buffer
                    System.out.printf("Reader %s:", getName());
                    for (int j = 0; j < BUFFER_LENGTH; j++) {
                        Thread.sleep(PAUSE);
                        System.out.print(BUFFER.charAt(j));
                    }
                    System.out.println();
                    
                	}
                    
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 
    // writer
    private static class Writer extends Thread {
        public void run() {
            int tact = 0;
            Random random = new Random();
            while (!stop) {
                try {
                	
                	synchronized (MONITOR) {
					
                    // clear buffer
                    BUFFER.setLength(0);
                    System.err.print("Writer writes:");
                    // write to buffer
                    for (int j = 0; j < BUFFER_LENGTH; j++) {
                        Thread.sleep(PAUSE);
                        char ch = (char) ('A' + random.nextInt(26));
                        System.err.print(ch);
                        BUFFER.append(ch);
                    }
                    System.err.println();
                    
                	}
                    
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (++tact == ITERATION_NUMBER)
                        stop = true;
                }
            }
        }
    }
 
    public static void main(String[] args) throws InterruptedException {
        // create writer
        Writer writer = new Writer(); 
 
        // create readers
        List<Thread> readers = new ArrayList<Thread>();
        for (int j = 0; j < READERS_NUMBER; j++) {
            readers.add(new Reader());
        }
 
        // start writer
        writer.start();
 
        // start readers
        Thread.sleep(10);
        for (Thread reader : readers) {
            reader.start();
        }
 
        // main thread is waiting for child threads
        writer.join();
        for (Thread reader : readers) {
            reader.join();
        }
    }
 
}