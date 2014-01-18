public class tkgweight
{
	private int ton, kilo,gram;
	private double weight;
	
	private void calc_wgt()
	{
	weight=(double)ton+(double)kilo/100+(double)gram/100000;	
	}
	
	public tkgweight()
	{
		ton=0;
		kilo=0;
		gram=0;
		calc_wgt();
	}
	
	public tkgweight(int ton, int kilo, int gram )
	{
		this.ton=ton;
		this.kilo=kilo;
		this.gram=gram;
		calc_wgt();	
	}
	
	public tkgweight(int gram)
	{
		this();
		this.gram=gram;
		calc_wgt();
	}
	
	public tkgweight(double kilo)
	{
		this();
		this.kilo=(int)Math.floor(kilo);
		kilo=kilo-(Math.floor(kilo));
		kilo*=1000;
		this.gram=(int)Math.floor(kilo);
		calc_wgt();
	}
	
	
	public double add(tkgweight obj)
	{
		return (this.weight+obj.weight);	
	}
	
	public double sub(tkgweight obj)
	{
		return (this.weight-obj.weight);	
	}
	
	public double mul(double n)
	{
		return (weight*n);
	}
	
	public double div(int n)
	{
		return (weight/n);	
	}
	
	public void compare(tkgweight obj)
	{
		if(this.weight>obj.weight)
			System.out.println("The original item is heavier");
		else
			System.out.println("The passed object is heavier");
	}
	
	public String toString ()
	{
		return ("The objects weight is  "+weight);
	}
	
}















