package ua.org.oa.kozlobaeva.Practice5.part2;

import ua.org.oa.kozlobaeva.Practice5.part2.Spam;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Part2 {
	
	public static void main(String[] args) throws AWTException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int key = 28;
		final long timer = 5000;

		List<Integer> time = new ArrayList<Integer>();
		time.add(1000);
		time.add(2000);
		time.add(5000);
		time.add(1000);
		time.add(2000);
		time.add(5000);

		List<String> m = new ArrayList<String>();
		m.add("Hello! ");
		m.add("I am  ");
		m.add("Bob");
		m.add("A");
		m.add("B");
		m.add("C");

		final Robot r = new Robot();
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);

			}
		}, 0, timer);


		Spam spam = new Spam(time, m);
		spam.start();

		try {
			if(br.readLine().equalsIgnoreCase("")){
				spam.interrupt();
			}
		} catch (IOException e) {

		}


	}

}