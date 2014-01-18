//import point_line.*;


public class try_linepoint
{
    
    public static void main(String[] args)
    {
    
    line l1,l2;
    point p1,p2;
    
    p1 = new point(4,5);
    p2 = new point(p1);
    p2.move(1,1);
    
    l1= new line(p1,p2);
    
        System.out.println("the l1 length is "+ l1.linelength());
        l1.disp();

    
    l2= new line(0,1,9,8);
    
        System.out.println("the l2 length is "+ l2.linelength());
        l2.disp();
    }
   


}
