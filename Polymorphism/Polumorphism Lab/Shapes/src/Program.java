import shapes.Circle;
import shapes.Rectangle;
import shapes.Shapes;

public class Program {
	public static void main(String[]args) 
	{
			
		  Shapes s = new Rectangle(4D,4D);
		 s.calculateArea();
		 System.out.println(s.getArea());
		 
		 Shapes circle = new Circle(3);
		 circle.calculateArea();
		  
	}

}
