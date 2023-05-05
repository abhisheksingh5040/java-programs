package design_pattern.builder;

public class AbstractFactoryDesignPattern {

	interface Shape {
		void draw();
	}

	interface Color {
		void fill();
	}

	class Rectangle implements Shape {

		@Override
		public void draw() {
			System.out.println("I am a Rectange");
		}
	}

	class Square implements Shape {

		@Override
		public void draw() {
			System.out.println("I am a Square");
		}
	}

	class Red implements Color {
		@Override
		public void fill() {
			System.out.println("I am Red color");
		}
	}

	class Blue implements Color {
		@Override
		public void fill() {
			System.out.println("I am Blue color");
		}
	}

	abstract class AbstractFactory {
		public abstract Shape getShape(String shapeType);

		public abstract Color getColor(String colorType);
	}

	class ShapeFactory extends AbstractFactory {

		@Override
		public Shape getShape(String shapeType) {
			if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
				return new Rectangle();
			} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
				return new Square();
			}

			return null;
		}

		@Override
		public Color getColor(String colorType) {
			return null;
		}

	}

	class ColorFactory extends AbstractFactory {

		@Override
		public Color getColor(String colorType) {
			if ("RED".equalsIgnoreCase(colorType)) {
				return new Red();
			} else if ("BLUE".equalsIgnoreCase(colorType)) {
				return new Blue();
			}
			return null;
		}

		@Override
		public Shape getShape(String shapeType) {
			return null;
		}
	}
	
	class FactoryProducer{
//		public static AbstractFactory getFactory() {
//			
//		}
	}

	public static void main(String[] args) {

	}

}
