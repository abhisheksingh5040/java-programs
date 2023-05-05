package java_dsa.basic.multithreading;

public class PrintNumber {
	
	boolean flag = false;//even number turn
	// flag =true odd number turn
	int n = 1;

	synchronized public void printEvenNumber() throws InterruptedException {
		if(!flag)
			wait();
		
		System.out.println("Even Number :"+this.n);
		n++;
		flag = true;
		notify();
	}
	
	synchronized public void printOddNumber() throws InterruptedException {
		if(flag)
			wait();
		
		System.out.println("Odd Number :"+this.n);
		n++;
		flag = false;
		notify();
	}
}
