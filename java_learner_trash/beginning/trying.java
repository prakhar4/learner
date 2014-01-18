/*   this program shows that if we want to initialise any variable 	with fractional value ike 12.43 then we weill have
	to use double and not float
	as float variable do not take point  */


public class trying
{
public static void main(String[] args)
{

// float d=1.34   ERROR
double a,c,b=20;
a=112.4334E12;
c=a*b;
System.out.println("the value for double is "+c);
float d;
d=b/3;
System.out.println("the float is "+d);

}


}