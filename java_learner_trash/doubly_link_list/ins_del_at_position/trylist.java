public class trylist
{
	public static void main(String[] args)
	{
		double[][] cord={{1,1},{2,2},{3,3},{4,4},{5,5}};
		int i;
		
		point[] points= new point[cord.length];
		for(i=0;i<cord.length;i++)
		{
			points[i]=new point(cord[i][0],cord[i][1]);
		}
		
		
		llist lst;
		
		lst=new llist(points);
		lst.see();
		
		lst.ins(new point(9,9), 3);
		lst.see();
		
		lst.del(5);
		lst.see();
		
		
	
	
	}

}
