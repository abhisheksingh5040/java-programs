package design_pattern.builder;

public class Main {

	public static void main(String[] args) {
		Product p1 = Product.builder()
				.id(0)
				.name("Abhishek")
				.build();
		
		System.out.println(p1);
	}

}
