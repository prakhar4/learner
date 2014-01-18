public class que
{
	public static void main(String[] args)
	{
		double area1, area2,w1,w2;
		
		
		mcmlength car11=new mcmlength(4,0,0);
		mcmlength car12=new mcmlength(2,9,0);
		
		area1=car12.area(car11);
		System.out.println(" area "+area1 );
		
		tkgweight weight1=new tkgweight(0,1,250);
		
				
		w1= weight1.mul(area1);
		w1*=600;
		
		System.out.println("The total weight of carpets is "+w1);
		
	}


}
