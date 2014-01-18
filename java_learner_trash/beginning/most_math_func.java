public class most_math_func  
{
public static void main(String[] args)
{

/* prg to get square root ************/
double a=16,c;
double b=Math.sqrt(a);
System.out.println("the square root of no is "+b);

/**********prg to get absolute value i.e mod value */
b=-25.343;
System.out.println("the absolute value for a is " +(Math.abs(b)));

/*********PRG TO GET the smallest integer value */

a=12.345;  b=-25.4524;
System.out.println("the smallest integer which is greater to the no  a &  b are " +(Math.ceil(a)) + "  " + (Math.ceil(b)));

/**** for greatest integer value */
System.out.println("the greatest integer which is less than a & b "+(Math.floor(a)) + "  "+ (Math.floor(b)));


/*********** for max and min of two numbers */
a=1;
b=-2;
c=3;
System.out.println("the min  and max of number is " +(Math.min(a,b)) + "   " +(Math.max(b,c)));


a=12.3433; b=43.7535;

/**** prg to get the round off value    NOTE - round n rint work the same  but use rint more due to the double return type*/

System.out.println("the rounding value of a and b  "+(Math.round(a))+ "   "+(Math.rint(b)  ) );






}

}