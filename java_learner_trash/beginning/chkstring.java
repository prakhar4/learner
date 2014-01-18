/* TO CHECK HOW TO ALLOCATE NEW MEMORY TO THE STRING VARIABLES AND THEN HOW TO ASSIGN THEM*/

public class chkstring
{
	public static void main(String[] args)
	{
		String s1,s2,s3;
		s1=new String("Hello");
		s2=s1;
		
		s3=new String(" World");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1="hiii";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s3="last";
		s2=s3;
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	
	}

}
