public class trypoint
{
  
    static void show()
    {
       System.out.println("hello");
    
    }
  
  
  
  public static void main(String[] args)
  {
    point pp1, pp2,pp3;
    double d;
    
    
    pp1=new point();
    pp1.show();
    
    pp2=new point(2,2);
    pp2.show();
    
    pp3=new point(pp2);
    pp3.show();
      
                 
    show();
    this.show();
    pp1.show();
    this.show();
    
    
    //d=pp1.dist(pp2);
    System.out.println(" distance is "+(pp2.dist(pp1)));
    
    
    
  
  }



}