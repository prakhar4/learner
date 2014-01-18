public class ex3_4
{
public static void main(String[] args)
{
int  a=65,flag=1;
double b;
System.out.println("generated character is " +((char)a));
b=Math.random();
//char f='?';

//System.out.println("generated character is " +((int)f));

while(flag==1)
{
b*=26;
b+=65;
b=Math.floor(b);

if((char)b=='A' ||  (char)b=='E' ||  (char)b=='I' ||   (char)b=='O' ||  (char)b=='U')
flag=1;
else
{System.out.println("generated character is " +((char)b));
  flag=0;}
}
}


}