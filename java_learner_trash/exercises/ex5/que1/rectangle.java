class rectangle
{
	point top, bottom;
	
	public rectangle()
	{
		top=new point();
		bottom= new point();
	}
	
	public rectangle(int a,int b,int c,int d)
	{ 
		top=new point(a,b);
		bottom=new point(c,d);
	}
	
	public rectangle(final rectangle rec)
	{
		this();
		this.top.x=rec.top.x;
		this.top.y=rec.top.y;
		this.bottom.x=rec.bottom.x;
		this.bottom.y=rec.bottom.y;
	}
	
	public rectangle enclose(final rectangle rec)
	{
		rectangle rect=new rectangle();
		rect.top.x=(Math.min(this.top.x,rec.top.x));
		rect.top.y=(Math.max(this.top.y,rec.top.y));		
		rect.bottom.x=(Math.max(this.bottom.x,rec.bottom.x));	
		rect.bottom.y=(Math.min(this.bottom.y,rec.bottom.y));
		return rect;
	}
	
	public String toString()
	{
	return (" the top point "+this.top+ "the bottom point "+this.bottom);
	
	}
}
