public class point
{
   int x;
   int y;
   
   
   point()
     {
       System.out.println("cont 1");
       x=1;
       y=1;
     
     }
     
   point(int xx, int yy)
     {
       System.out.println("cont 2");
       x=xx;
       y=yy;
     
     }
     
     
   point(point m)
   {
      System.out.println("cont 3");
      x=m.x;
      y=m.y;     
   }
   
   
   
   
   double dist(point p1)
   {
       return (Math.sqrt(((x-p1.x)*(x-p1.x))+((y-p1.y)*(y-p1.y))));
          
   }
   
   
   void shift(int delx, int dely)
   {
       x+=delx;
       y+=dely;   
   }
   
   
   void show()
   {
      System.out.println("x is "+x+" and y is "+y );
       
   
   }
   
   
  


}