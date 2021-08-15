package AS2.Q5.Shapes;

abstract class Shape {
	public abstract void draw();
}

class Cube extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Cube");
	}
	
}

class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a line");
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Rectangle");
	}

}

public class DrawShapes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape line=new Line();
		Shape rectangle=new Rectangle();
		Shape cube=new Cube();
		line.draw();
		rectangle.draw();
		cube.draw();
	}
}
