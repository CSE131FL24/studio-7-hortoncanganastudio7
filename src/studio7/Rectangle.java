package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private static final Color BLACK = null;
	private double length; 
	private double width; 
	public Rectangle(double length, double width) { 
		this.length=length; 
		this.width=width; 
	}
	public double area() {
		return length*width; 
		}
	
	public double perimeter() {
		return 2*length+width; 
	}
	public boolean isSmaller(Rectangle other) {
		return this.area()<other.area();
	}
	public boolean isSquare() { 
		return length==width; 
	}
	public String toString() {
		return "\nLength " + length +"\nWidth "+width+"\nArea "+area()+
				"\nPerimeter "+perimeter()+"\nisSmaller "+isSmaller(new Rectangle (0,0))+
				"\nIs it a square ?"+isSquare();
	}
	public String toString(Rectangle other) { 
		return this.toString()+"\nCompared to Rectangle\nArea "
	+other.area()+"\nIs Smaller "+ isSmaller(other); 
	}
	
	public  void Draw() { 
		StdDraw.rectangle(.50, .50, width/2, length/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(.5,.5);
		Rectangle r2=new Rectangle(.2,.5);
		System.out.println(r1.toString(r2));
		
		r1.Draw();
	}
}
