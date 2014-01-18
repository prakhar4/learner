public class sphere
{

  int rad,x,y,z;
  static int count=0;
  static final double PI=3.14;
  
  public static int getcount()
  {
     return(count);
  
  }
  
  
  sphere(int radius, int xco, int yco, int zco)
  {
     count++;
     rad=radius;
     x=xco;
     y=yco;
     z=zco;
     
  }
  
  void volume()
  {
    double vol;
    vol=(4/3)*rad*rad*rad*PI;
    System.out.println("the volume is "+vol);
  
  
  
  }
  
 
/*******
    EVEN THE MAIN WORKS HERE FINE BUT HAVING IT IN DIFFERENT FILES
    MAKES IT MORE INTERESTING .... 



 public static void main(String[] args)
 {
  
  System.out.println("the number of classes  "+sphere.getcount());
  
  sphere ball=new sphere(4,1,2,3);
  
  System.out.println("the number of classes  "+sphere.getcount());
  sphere earth=new sphere(5,6,8,3);
  
  System.out.println("the number of classes  "+sphere.getcount());

  ball.volume();
  earth.volume();


} 

*/



}