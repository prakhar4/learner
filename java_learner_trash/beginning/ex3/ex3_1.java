public class ex3_1
{
public static void main(String[] args)
{
double a;
a=Math.random();
a*=10;
a=Math.floor(a);
a%=6;
System.out.println(" the value is "+a);

switch((int)a)         //NOTE--- WE NEED TO TYPECAST AS SWITCH DOES
{		            //NOT SUPPORT DOUBLE AS ARGUMENT
case 1:
System.out.println(" the value is "+a);
break;

case 2:
System.out.println(" the value is "+a);
break;
case 3:
System.out.println(" the value is "+a);
break;
case 4:
System.out.println(" the value is "+a);
break;
case 5:
System.out.println(" the value is "+a);
break;
case 0:
System.out.println(" the value is "+a);
break;
}


}



}