/***************THIS PRG IS TO CHECK IF WE CAN HAVE LABELS LATER FOR 
                LABELLED CONTINUE--- AS WE KNOW THAT LABEL CAN COME B4 IT IS CALLED *********/

public class continuess
{
  public static void main(String[] args)
  {
    
    int a=1;
     /* ABC:
    {
    System.out.println("this is third line");
    }
   
    
    System.out.println("this is first line");
    if( a==1) continue ABC;
    System.out.println("this is the second line");
  */
  
  ABC:
  //System.out.println("hello");    //ERROR dont know why..... 
                          /************may be continue can only be used with loops begining*/
  for(int i=0;i<4;i++)
  {
     if(i%2==0) continue ABC;
     System.out.println(i);
  
  
  }
  
  
  
  }



}