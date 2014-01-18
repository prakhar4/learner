public class recurs
{
	
	
	
	public static void main(String[] args)
	{
	
	power p= new power();
	double a;		
	
	
		
		a=p.pow(2,5);
		System.out.println("The value for power is "+ a );
		a=p.pow(2,-2);
		System.out.println("The value for power is "+a );
		a=p.pow(2,1);
		System.out.println("The value for power is "+ a);
		a=p.pow(2,0);
		System.out.println("The value for power is "+ a);

	}
	
	
	/*static double pow(int x , int n)
	{
		if(n>0)
			return x*pow(x,n-1);
		else if (n<0)
			return 1/pow(x,-n);
		else 
			return (n==1)?x:1;
	
	}*/

}