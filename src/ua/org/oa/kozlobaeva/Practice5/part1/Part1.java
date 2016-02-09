package ua.org.oa.kozlobaeva.Practice5.part1;

public class Part1 {
	
	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		thread1.run();

		MyThread2 thread2 = new MyThread2();
		thread2.start();

	}

}
