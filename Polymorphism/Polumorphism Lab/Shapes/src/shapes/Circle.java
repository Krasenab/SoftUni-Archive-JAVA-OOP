package shapes;

public class Circle extends Shapes {

	private double radius;
	public Circle(double radius) 
	{
		this.setRadius(radius);
	}
	
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	public Double getRadius() 
	{
		return this.radius;
	}
	
	
	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double result = Math.PI*(this.radius*this.radius);
	}
	
}
