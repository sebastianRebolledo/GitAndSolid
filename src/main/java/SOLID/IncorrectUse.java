package SOLID;

import java.util.ArrayList;

import SOLID.CorrectUse.Circle;
import SOLID.CorrectUse.Rectangle;
import SOLID.CorrectUse.Shape;
import SOLID.CorrectUse.ShapeDetails;

public class IncorrectUse {
	
	
	

	public IncorrectUse() {
		
		
		Rectangle r = new Rectangle(20, 10);
		Circle c = new Circle(5);
		
		ArrayList<Shape> array = new ArrayList<Shape>();
		
		array.add(r);
		array.add(c);
		
		
		for (Shape shape : array) {
			
			System.out.println("Area: "+ shape.area + " Perimeter: "+shape.perimeter + " Type: "+shape.getClass().getSimpleName());
		}

	}
	

	public static void main(String[] args) {
		IncorrectUse incorrectUse = new IncorrectUse();

	}
	
	
	
	class Shape {
		
		
		
		
		int area;
		int perimeter;
		
		
		public Shape( ) {
			this.area = 0;
			this.perimeter = 0;
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	class Rectangle extends Shape{
		
		int height;
		int width;
		
		public Rectangle(int height, int width) {
			this.height = height;
			this.width = width;
			this.area=getArea();
			this.perimeter=getPerimeter();
		}
		
		public int getArea() {
			
			return this.height*this.width;
		}
		
		
		
		public int getPerimeter() {
			return 2*(this.width+this.height);
		}
		
		
		
		
		
	}
	
	class Circle extends Shape{
		
		int radius;
	
		
		public Circle(int radius) {
			this.radius = radius;
			this.area=getArea();
			this.perimeter=getPerimeter();
		
			
		}
		
		public int getArea() {
			
			return (int)(Math.PI*(this.radius*this.radius));
		}
		
		
		
		public int getPerimeter() {
			return (int)(Math.PI*this.radius*2);
		}
		
		
		
		
		
	}
	
	

}
