package cz.vibri.concurrency.app;

import cz.vibri.concurrency.runners.Run1;
import cz.vibri.concurrency.runners.Run2;

public class App2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Run1());
		Thread t2 = new Thread(new Run2());
		
		t1.start();
		t2.start();

	}

}
