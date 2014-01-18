public class tkgcheck
{
	public static void main(String[] args)
	{
		
		tkgweight m1,m2,m3,m4;
		
		m1=new tkgweight();
		System.out.println("The object now is " +m1);
		
		m2= new tkgweight(5,40,67);
		System.out.println("The object now is " +m2);
		
		m3=new tkgweight(4352);
		System.out.println("The object now is " +m3);
		
		m4=new tkgweight(98.824);
		System.out.println("The object now is " +m4);
		
		System.out.println("The addition of 1 2  is " +(m1.add(m2)));
		
		System.out.println("The subtration of 3 4  is " +(m4.sub(m3)));
		
		m1.compare(m3);
		m2.compare(m4);
		
		m3.mul(4);
		System.out.println("Now the weight is "+ m3);
		
		m2.div(2);
		System.out.println("Now the weight is "+ m2);
		
		
		
		
	
	}

}




