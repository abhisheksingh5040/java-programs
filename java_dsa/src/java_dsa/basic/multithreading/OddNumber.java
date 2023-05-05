package java_dsa.basic.multithreading;

public class OddNumber extends Thread {

	PrintNumber printNumber;

	OddNumber(PrintNumber printNumber) {
		this.printNumber = printNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			try {
				printNumber.printOddNumber();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
