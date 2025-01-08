package shapes;

public class Rectangle extends Shapes {

	private double height;
	private double width;
	//private double area;
	public Rectangle(double height,double width) 
	{
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getHeight() 
	{
		return this.height;
	}
	public void  setWidth(double width) 
	{
		this.width = width;
	}
	@Override
	public void calculatePerimeter() {
				
		
		//double result = this.area/ this.width;
		double result = this.height * 2 + this.width * 2;
		super.setPerimeter(result);		
	}

	@Override
	public void calculateArea() {			
		double result = this.width*this.height;
		//this.area = result;
		super.setArea(result);
	}

}
