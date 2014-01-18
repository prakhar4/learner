public class linkedlist
{
	private list start=null;
	private list current=null;
	private list temp=null;
	private list end=null;
	
	private class list
	{
		Object item;
		list next;
		
		public list(Object i )
		{
			item=i;
			next=null;
			
		}
		
	}
	
	linkedlist()
	{}
	
	linkedlist(Object i)
	{
		list temp=new list(i);
		
		if(start==null)
		{
			start=temp;
			end=temp;
		}	
	}
	
	linkedlist(Object[] y)
	{
		int i;
		for(i=0;i<y.length;i++)
		{
			additem(y[i]);
		}
		
	
	}
	
	public void additem(Object t)
	{
		list r=new list(t);
		
		
		if(start==null)
		{
			start=end=r;			
		}
		else
		{
			end.next=r;
			end=r;
		}
	}
	
	public list getsnext(list q)
	{
		return (q.next);
	}
	
	public Object getfirst()
	{
		return (this.start);
	}
	
	
	public void see()
	{
		//Object current;
		
		current=(list)getfirst();
		while(current!=null)
		{
			System.out.println(" "+/*(point)*/current.item);   // no need to cast this to another type
			current=getsnext(current);
			
		}
	
	}
	
	
}
