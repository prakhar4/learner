public class labelcontinuos
{
public static void main(String[] args)
{
/****** CODE TO SHOW THAT FLOAT CALCULATIONS ARE NOT EXECT ****** 
int a,b;
for(double i=0; i<2;i+=0.2)

System.out.println(" "+i);
*/

/*************** using LABELLED CONTINUOUS****/
for(int i=0;i<5;i++)
{
ABC:
for(int j=0;j<i+1;j++)
{
if(j%2==0) continue ABC;
System.out.print(" " +j);
}
System.out.print(" \n" );
}



}

}