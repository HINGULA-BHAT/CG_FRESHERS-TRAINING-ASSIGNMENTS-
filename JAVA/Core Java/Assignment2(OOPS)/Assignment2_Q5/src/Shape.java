    abstract class shapes{
	       void draw(){
	    	   
	       }
	}
	class Line extends shapes{
		void draw() {
			System.out.println("This is Line");
		}
	}
	class Rectangle extends shapes{
		void draw() {
			System.out.println("This is Line Rectangle");
		}
	}
	class Cube extends shapes{
		void draw() {
			System.out.println("This is Line Cube");
		}
	}
	class Square extends shapes{
		void draw() {
			System.out.println("This is Line Square");
		}
	}

public class Shape {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Line o=new Line();
         o.draw();
         
         Rectangle o1=new Rectangle();
         o1.draw();
         
         Cube o2=new Cube();
         o2.draw();
         
         Square o3=new Square();
         o3.draw();
		
		

	}

}