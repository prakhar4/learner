public class trial
{

public static void main(String[] args)
{
	dog d1,d2,d3;
	d1=new dog();
	d2=new dog("Hallo");
	d3=new dog("Jimmy","Alsesian");
	
	System.out.println(" "+d1);
	System.out.println(" "+d2);
	System.out.println(" "+d3);
	System.out.println(" try is "+d1.other());
}	
}
