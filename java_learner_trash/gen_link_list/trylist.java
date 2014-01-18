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
		
		
		linkedlist lst;		
		lst=new linkedlist(points);		
		lst.see();
	
		lst.additem(new point(6,6));			
		lst.see();
		
		String[] names={"dog", "cat", "tiger", "lion"};
		
		animal[] ani=new animal[names.length];
		for(i=0;i<names.length;i++)
		{
			ani[i]=new animal(names[i]);	
			
		}
		
		linkedlist anilst;
		anilst=new linkedlist(ani);
		anilst.see();
		
		anilst.additem(new animal("duck"));
		anilst.see();
		
		
	
	
	}

}
