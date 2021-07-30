package SOLID;

import java.util.ArrayList;

public class CorrectUse {

	
	public CorrectUse() {
		
		
		Rectangle r = new Rectangle(20, 10);
		Circle c = new Circle(5);
		
		ArrayList<Shape> array = new ArrayList<Shape>();
		
		array.add(r);
		array.add(c);
		
		ShapeDetails shapeDetails= new ShapeDetails();
		shapeDetails.setShapes(array);
		shapeDetails.printDetails();
		
		
		
		
	}
	
	

	
	
	
	public static void main(String[] args) {
		CorrectUse correctUse = new CorrectUse();
		
		
		
		

	}
	
	
	
	class ShapeDetails{
		
		private ArrayList<Shape> shapes;
		
		public ShapeDetails() {
			this.shapes=new ArrayList<Shape>();
		}
		
		public void setShapes(ArrayList<Shape> shapes) {
			this.shapes = shapes;
		}
		
		public ArrayList<Shape> getShapes(){
			return this.shapes;
			
			
		}
		
		public void printDetails() {
			for (Shape shape : shapes) {
			
				System.out.println("Area: "+ shape.area + " Perimeter: "+shape.perimeter + " Type: "+shape.getClass().getSimpleName());
			}
			
		}
		
		
		
		
		
		
		
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
