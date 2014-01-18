public class sphere
{

  int rad,x,y,z;
  static int count=0;
  
  public static int getcount()
  {
     return(count);
  
  }
  
  sphere()
  {
    
    count++;
    x=y=z=2;
    rad=1;
    System.out.println("cnstr 1");
  
  }
  
  
  
  sphere(int radius)
  {
     this();      // REMEMBER - THIS SHOULD BE THE FIRST STATEMENT
     System.out.println("cnstr 2");
     rad=radius;
     
  }
  
  
  sphere(int xx, int yy , int zz, int radd)
  {
    this(radd);
    System.out.println("cnstr 3");
    //this(radd);          ERR0R AS THIS SHOULD BE IN THE FIRST LINE ONLY
    x=xx;
    y=yy;
    z=zz;
  
  }
  
  
  sphere ( final sphere s)
  {
    x=s.x;
    y=s.y;
    z=s.z;
    rad=s.rad;
  
  }
  
  
   sphere ( final sphere s, sphere p)
  {
    x=s.x;
    y=s.y;
    z=s.z;
    rad=s.rad;
    s.x+=1;        //POSSIBLE  AS WE ARE NOT CHANGING s BUT VALUE WITHIN s
    //s=p;    ERROR AS s IS FINAL HERE  AND SO CHANGING NOT POSSIBLE 
  
  }
  
  
  
  void change()
  {
   x+=2;
   y+=2;
   z+=2;
   rad+=5;
  }
  
  
  
  
  void disp()
  {
    System.out.println("x is "+ x+" y is "+ y+" z is "+ z+" radius is "+rad );
  
  
  }
  
  
  }
  