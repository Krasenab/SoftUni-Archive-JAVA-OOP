package shapes;

public abstract class Shapes {
	
	private double perimeter;
	private double area;
	
	public Shapes() {}
	public Shapes(double perimetr,double area) 
	{
		this.setArea(area);
		this.setPerimeter(perimetr);
	}
	
	public void setPerimeter(double perimeter) 
	{
		if(perimeter<=0) 
		{
			 new IllegalArgumentException("Cannot set zero for perimeter");
		}
		
		this.perimeter = perimeter;
	}
	public Double getPerimerter() 
	{
		return this.perimeter;
	}
	
	public void setArea(Double area) 
	{
		if(area<=0) 
		{
			new IllegalArgumentException("Connot set zero for area");
		}
		this.area = area;
	}
	public Double getArea() 
	{
		return this.area;
	}
	
	
	public abstract void calculatePerimeter();
	
	public abstract void calculateArea();
}
