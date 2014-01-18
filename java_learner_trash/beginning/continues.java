/****************************************** NOTE THAT GIVING CONTINUE INSIDE A NESTED FOR LOOP WILL ONLY CONTINUE WITH THAT PARTICULAR CASE WITH INSIDE LOOP (OR WHICH EVER LOOP THAT CONTINUE IS MENTIONED IN) THE OUTTER LOOP RUNS AS NORMAL  *********************/



public class continues
{
public static void main(String[] args)
{
int i,j=0;
for(i=0;i<5;i++)
{
//if(i%2==0) continue;
for(j=0;j<i+1;j++)
{
//if(j%2==0) continue;
System.out.print(" " +j);
}
System.out.print(" \n" );
}


}

}
