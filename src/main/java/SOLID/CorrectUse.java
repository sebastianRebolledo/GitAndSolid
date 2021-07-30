package SOLID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CorrectUse {
	
	
	private int 
		b;
	kskskskksksksk
	private HashMap sdaigja;
	
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
				
				
				shape.getDetails().forEach((k,v) -> System.out.println( k +" : " + v));
				System.out.println( "Type: "+shape.getClass().getSimpleName());
				
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	class Shape {
		
		private HashMap<String,Integer> details;
		
		
		
		int area;
		int perimeter;
		
		
		public Shape( ) {
			this.area = 0;
			this.perimeter = 0;
			this.details = new HashMap();
			
		}
		
		public HashMap<String,Integer> getDetails(){
			return this.details;
			
		}		
		
		
		
		
		
		
	}
	
	
	class Rectangle extends Shape{
		
		int height;
		int width;
		
		public Rectangle(int height, int width) {
			this.height = height;
			this.width = width;
			super.details.put("Area", Integer.valueOf(this.getArea()));
			super.details.put("Perimeter", Integer.valueOf(this.getPerimeter()));
			super.details.put("Height", Integer.valueOf(height));
			super.details.put("Widht", Integer.valueOf(Integer.valueOf(width)));
			
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
		int diameter;
	
		
		public Circle(int radius) {
			
			this.radius = radius;
			
			super.details.put("Area", Integer.valueOf(this.getArea()));
			super.details.put("Radius", Integer.valueOf(radius));
			super.details.put("Perimeter", Integer.valueOf(this.getPerimeter()));
			super.details.put("Diameter", Integer.valueOf(this.getDiameter()));

		
			
		}
		
		public int getArea() {
			
			return (int)(Math.PI*(this.radius*this.radius));
		}
		
		
		
		public int getPerimeter() {
			return (int)(Math.PI*this.radius*2);
		}
		
		public int getDiameter() {
			return this.radius*2;
			
		}
		
		
		
		
		
	}
	

}
