package application;

import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesenum.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Shape rectangle = new Rectangle(Color.WHITE, 4.00, 5.00);
		Shape circle = new Circle(Color.BLACK, 3.0);
		
		System.out.println("Rectangle");
		System.out.println("Color: " + rectangle.getColor());
		System.out.println("Area do rectangle: " + String.format("%.2f", rectangle.area()));
		System.out.println();
		System.out.println("Circle");
		System.out.println("Color: " + circle.getColor());
		System.out.println("Area do circle: " + String.format("%.2f", circle.area()));
	}

}
