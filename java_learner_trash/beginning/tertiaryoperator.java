/* prg to illustrate use of tertiary operators  */

public class tertiaryoperator
{
public static void main(String[] args)
{
int a=12, b=32,c=3 ;
   /* c = (a<b)  ?  (System.out.println("a is smaller")): (System.out.println("b is smaller"));       NOTE-- this line is showingg error as println gives void type*/


 c=(a>b)?a:b;
System.out.println(" value " +c);

c=4;

System.out.println("the number which is smallerr is " + ((a<b) ?a:b ));
System.out.println("the greatest number is "+ ((a>b)?  ((a>c)?a:c) : ((b>c)?b:c)));



}



}




