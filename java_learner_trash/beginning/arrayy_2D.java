public class arrayy_2D
{
   public static void main(String[] args)
   {
      int [][] first= new int[4][2];
      System.out.println(first.length);
      for(int i=0;i<first.length;i++)
        System.out.println(first[i].length);
      
      /*
      int [] sys;           NOT ALLOWED AS sys WOULD BE ONLY REFERENCING SO WE CANNOT 
      sys  ={1,2,3,4};      ASSIGN VALUES TO IT AS THIS  */
      
      
      int[] sys={1,2,3,4,5};                    //ALLOWED 
      
      
      int[][] second=new int[3][];
     /* for(int i=0;i<second.length;i++)         ERROR   WE CANNOT ASSIGN VALUES TO LENGTH OF ARRAY
         second[i].length=i+1;*/
         
       second[0]=new int[8];                     // CORRECT 
       second[1]= new int[4]= {1,2,3,4};          // ERROR    
       //second[2][]={1,2,5,6,7,8};                ERROR   AS FOR ABOVE sys REASON
       
         
      /***********   WE GET A NULL POINTER  EXCEPTION AS WE HAVEN'T INITIALISED REST TWO ARRAYS  */
      
       
      for(int i=0;i<second.length;i++)
         System.out.println(second[i].length);
         
         
   
   
   
   }


}