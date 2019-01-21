import java.util.*;
class circle
{
	private double r;
	private String colour;
	private final double pi = 3.14;
	circle()
	{
		r = 1.0;
	}
	circle(double r)
	{
		this.r = r;
	}
	circle(double r , String colour)
	{
		this.r = r;
		this.colour = colour;
	}
	public double getr()
	{
		return r;
	}
	public void setr()
	{
		this.r = r;
	}
	public void setcolour()
	{
		this.colour = colour;
	}
	public String getcolour()
	{
		return colour;
	}
	public void setcolour(String colour)
	{
		this.colour = colour;
	}
	public double getArea()
	{
		return pi*r*r;
	}
}
class cylinder extends circle
{
	private double height;

	cylinder()
	{
		super();
		height = 1.0;
	}
	cylinder (double r)
	{
		super (r);
	}
	cylinder(double r, double height)
	{
		super (r);
		this.height = height;
	}
	cylinder(double r, double height, String colour)
	{
		super (r, colour);
		this.height = height;
	}
	public double getheight()
	{
		return height;
	}
	public void setheight()
	{
		this.height = height;
	}
	public double getvolume()
	{
		return super.getArea()*height;
	}
}
	public class Test
	{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		cylinder c1 = new cylinder(2,3,"blue");
		System.out.println(c1.getvolume());
		System.out.println(c1.getcolour());
		System.out.println(c1.getArea());
		
	}
}