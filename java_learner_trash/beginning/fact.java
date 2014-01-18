public class fact
{
	public static void main(String[] args)
	{
			int a;
			a=fac(5);
			System.out.println("the factorial is " + a);
			a=fac(-5);
			System.out.println("the factorial is " + a);
			a=fac(1);
			System.out.println("the factorial is " + a);
			
			
	
	
	}
	
	
	static int fac(int n)
			{
				if(n>1) return n*fac(n-1);
				else if (n==1) return 1;
				else return 0;
			}
}