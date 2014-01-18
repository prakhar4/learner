public class llist
{
	private class list
	{
		Object item;
		list next;
		list prev;
		
		public list(Object i)
		{
			item=i;
			next=null;
			prev=null;
		}	
	}
	
	private list start;
	private list end;
	private list temp;
	
	public llist(Object i)
	{
		additem(i);
	}
	
	public llist(Object[] t)
	{
		int i;
		for(i=0;i<t.length;i++)
		{
			additem(t[i]);
		}
	}
	
	public void additem(Object i)
	{
		temp=new list(i);
		if(start==null)
		{
			start=end=temp;
		}
		else
		{
			temp.prev=end;
			end.next=temp;
			end=temp;
		}
	}
	
	public void see()
	{
		temp=start;
		System.out.println("Printing forward");
		while(temp!=null)
		{
			System.out.println(" "+temp.item);
			temp=temp.next;
		}
		
		temp=end;
		System.out.println("Printing backward");
		while(temp!=null)
		{
			System.out.println(" "+temp.item);
			temp=temp.prev;
		}
	
	}

}
