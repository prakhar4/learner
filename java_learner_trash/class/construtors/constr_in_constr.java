public class constr_in_constr
{
  public static void main(String[] args)
  {
      sphere s1,s2,s3,s4;
      final int a=5;
      //a++;        ERROR AS VALUE FOR FINAL IS CONSTANT
      
      s1=new sphere();
      s1.disp();
      System.out.println(" "+sphere.getcount());
      
      s2=new sphere(2);
            s2.disp();
            System.out.println(" "+sphere.getcount());

      
      s3=new sphere(4,4,4,10);    // CALLING CONSTRU WITHIN ONE ANOTHER
            s3.disp();
            System.out.println(" "+sphere.getcount());

      
      s4=new sphere(s3);
        s4.disp();
        System.out.println(" "+sphere.getcount());         //CREATING A COPY OF OBJ
        
        
        
        s1=new sphere(s2,s3);
        s1.disp();
        System.out.println(" "+sphere.getcount()); 
        
        s2.disp();
        
      s3.disp();
      s3.change();
      s3.disp();
      System.out.println(" "+sphere.getcount());
      
      s4.change();
      s4.disp();
      System.out.println(" "+sphere.getcount());
      
  
  }




}