package cz.vibri.concurrency.runners;

public class Run1 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("Runner1: " + i);
		}
	}
}
