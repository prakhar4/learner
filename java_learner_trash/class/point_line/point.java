//package point_line;

public class point
{
    int x,y;
    static int count=0;
    
    public void getcount()
    {
        System.out.println("the no of points till now is  "+count);
    
    }
    
    
    public point()
    {
        x=y=0;
        count++;
    }
    
    public point(int x,int y)
    {
        this();
        this.x=x;
        this.y=y;  //we dont have to write count++ again
    }
    
    public point(final point p)
    {
        this();
        this.x=p.x;
        this.y=p.y;
        
    }
    
    
    public void move(int delx, int dely)
    {
        x+=delx;
        y+=dely;
    }
    
    public double dist(point s)
    {
        return (Math.sqrt((this.x-s.x)*(this.x-s.x)+(this.y-s.y)*(this.y-s.y)));
    }

    public String toString()
    {
        return (" "+ x + ", " + y);
    
    }
    
  /*  
    void disp(point s)
    {
        System.out.println(" x=" +x+ " y=" +y);
    
    }*/
    

}
