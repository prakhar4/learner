public class point
{
	private double x;
	private double y;
	
	public point()
	{
		x=y=0;
	}
	
	public point(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public point(point p)
	{
		x=p.x;
		y=p.y;
	}
	
	public String toString()
	{
		return (" the cordinates are "+x+","+y);
	}

}
