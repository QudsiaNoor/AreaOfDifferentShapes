import java.util.*;

abstract class Shape{
	
	float area;
	
	abstract public void acceptInput();  // ABSTRACT METHOD
	abstract public void compute();      // ABSTRACT METHOD
	
	public void disp() {                 // CONCREATE METHOD
		
		System.out.println("area is:"+area);
	}
	
}
class Square extends Shape{
	
	private float length;
	
	public void acceptInput() {             // OVERRIDDEN METHOD
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length");
	length = scan.nextFloat();
	
	}	
	 public void compute() {                  // OVERRIDDEN METHOD
		 
		area = length*length;
		
	}
	
}
class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	public void acceptInput() {                   // OVERRIDDEN METHOD
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length");
		length = scan.nextFloat();
		System.out.println("Enter breadth");
		breadth = scan.nextFloat();
	}
	public void compute() {                         // OVERRIDDEN METHOD
		
		area = length*breadth;
	}
}
class Circle extends Shape{
	
	private float radius;
	
	public void acceptInput() {                     // OVERRIDDEN METHOD
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = scan.nextFloat();
		
	}
	public void compute() {                         // OVERRIDDEN METHOD
		
		area = 3.14f*radius*radius;
	}
}
class Geometry{
	
	public void permit(Shape ref) {         // LOOSE COUPLING
		
		ref.acceptInput();                  // POLYMORPHISM ACHIEVED
		ref.compute();
		ref.disp();
	}
}
public class launch {

	public static void main(String[] args) {
		
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
		
		
	}

}
