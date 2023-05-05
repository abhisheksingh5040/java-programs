package java_dsa.basic.multithreading;

public class Main {

	public static void main(String[] args) {
		PrintNumber number = new PrintNumber();
		EvenNumber evenNumber = new EvenNumber(number);
		OddNumber oddNumber  = new OddNumber(number);
		
		evenNumber.start();
		oddNumber.start();
	}

}
