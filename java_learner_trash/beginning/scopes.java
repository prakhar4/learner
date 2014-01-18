public class scopes
{
public static void main(String[] args)
{
int a=345;
{			
/************************************************************WE CAN HAVE VARIABLES NEWLY DECLARED INSIDE A BLOCK {} AND THIS REMAINS INACCESIBLE OUTSIDE THAT BLOCK */

int b=123;
System.out.println("this is to check scope a & b "+ a+ "  "+b);

}
int b=546;
System.out.println("the value of b is "+b );  // DIFFERENT b


//int a=970;
//System.out.println("the value for a "+a);  CANNOT DECLARE AGAIN

for(int i=0;i<5;i++)
System.out.println(" "+i);		// note i is initialised inside for

//System.out.println("the value of i " +i);    // ERROR 

/*****************************AS i IS INITIALISED INSIDE FOR LOOP HENCE IT IS ACCESSIBLE ONLY TO THE FOR LOOP COMMANDS AND NOT OUTSIDE THAT *****/

}


}