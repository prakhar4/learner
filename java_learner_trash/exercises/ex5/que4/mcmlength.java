public class mcmlength
{
	private int meter, centi,milli;
	private double length;
	
	private void calc_len()
	{
	length=(double)meter+(double)centi/100+(double)milli/1000;	
	}
	
	public mcmlength()
	{
		meter=0;
		centi=0;
		milli=0;
		calc_len();
	}
	
	public mcmlength(int meter, int centi, int milli )
	{
		this.meter=meter;
		this.centi=centi;
		this.milli=milli;
		calc_len();	
	}
	
	public mcmlength(int milli)
	{
		this();
		this.milli=milli;
		calc_len();
	}
	
	public mcmlength(double centi)
	{
		this();
		this.centi=(int)Math.floor(centi);
		centi=centi-(Math.floor(centi));
		centi*=10;
		this.milli=(int)Math.floor(centi);
		calc_len();
	}
	
	
	public double add(mcmlength obj)
	{
		return (this.length+obj.length);	
	}
	
	public double sub(mcmlength obj)
	{
		return (this.length-obj.length);	
	}
	
	public void mul(int n)
	{
		length*=n;
	}
	
	public void div(int n)
	{
		length/=n;	
	}
	
	public void compare(mcmlength obj)
	{
		if(this.length>obj.length)
			System.out.println("The original item is longer");
		else
			System.out.println("The passed object is longer");
	}
	
	public double area(mcmlength obj)
	{
		return (this.length*obj.length);	
	}
	
	public String toString ()
	{
		return ("The objects length is  "+length);
	}
	
}















