public class mcmcheck
{
	public static void main(String[] args)
	{
		double t=454.245;
		System.out.println(" "+t);
		
		mcmlength m1,m2,m3,m4;
		
		m1=new mcmlength();
		System.out.println("The object now is " +m1);
		
		m2= new mcmlength(5,40,67);
		System.out.println("The object now is " +m2);
		
		m3=new mcmlength(4352);
		System.out.println("The object now is " +m3);
		
		m4=new mcmlength(98.824);
		System.out.println("The object now is " +m4);
		
		System.out.println("The addition of 1 2  is " +(m1.add(m2)));
		
		System.out.println("The subtration of 3 4  is " +(m4.sub(m3)));
		
		m1.compare(m3);
		m2.compare(m4);
		
		m4.area(m2);
		
		m3.mul(4);
		System.out.println("Now the length is "+ m3);
		
		m2.div(2);
		System.out.println("Now the length is "+ m2);
		
		
		
		
	
	}

}




