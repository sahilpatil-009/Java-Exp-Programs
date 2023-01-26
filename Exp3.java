
import java.util.*;

abstract class Shape{
	
		double area,perimeter;
		String name;
	
		abstract public void CalArea();
		abstract public void CalPeri();
		
		public void display(){
			System.out.println("Area of "+name+" is "+area);
			System.out.println("Perimeter of"+name+" is "+perimeter);
		}
}

class Triangle extends Shape{
	
	double l,h;
	//String trig;
	Triangle(double l,double h,String trig){
		this.l = l;
		this.h = h;
		this.name = trig;
	}
	public void CalArea(){
		area = l*h;
	}
	
	public void CalPeri(){
		perimeter = 3.14*(l+h);
	}
}

class Rectangle extends Shape{
	
	double l,b;
	//String Rect;
	Rectangle(double l,double b,String Rect){
		this.l = l;
		this.b = b;
		this.name = Rect;
	}
	public void CalArea(){
		area = l*b;
	}
	public void CalPeri(){
		perimeter = 3.14*(l+b);
	}
}

class Circle extends Shape{
	double r;
	//String Cir;
	Circle(double r,String Cir){
		this.r = r;
		this.name = Cir;
	}
	public void CalArea(){
		area = 3.14*r*r;
	}
	
	public void CalPeri(){
		perimeter = r*r*r;
	}
}

class Shapetest{
	
	public static void main(String[] args)
	{
		Shape s1 = new Triangle(4,5,"Triangle");
			  s1.CalArea();
			  s1.CalPeri();
			  s1.display();
	   s1 = new Rectangle(6,7,"Rectangle");
			  s1.CalArea();
			  s1.CalPeri();
			  s1.display();
	   s1 = new Circle(5,"Rectangle");
			  s1.CalArea();
			  s1.CalPeri();
			  s1.display();
	}
}

