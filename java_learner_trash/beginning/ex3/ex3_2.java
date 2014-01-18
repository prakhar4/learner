/********* TO CHECK FOR PRIME NO THEN WE NEED TO CHEXK ONLY TILL THE SQUARE ROOT OF THE NUMBER ******/



public class ex3_2
{
public static void main(String[] args)
{
double a;
int n=122,flag=0;
a=Math.sqrt(n);
a=Math.floor(a);
for(int i=2;i<=a;i++)
{
if((n%i)==0) 
{
System.out.println("the number is not prime");
flag=1;
break;
}

}
if(flag==0)
System.out.println("number is prime");

}



}