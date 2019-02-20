package cz.vibri.concurrency.runners;

public class Run2 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("Runner2: " + i);
		}
	}
}
