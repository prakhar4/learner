public class animal
{
	protected int p;
	private String type;
	
	animal()
	{
		type=new String(" fish ");
	}
	
	animal(String typ)
	{
		type=new String(typ);
	}
	
	public String toString()
	{
		return (" The type of animal is "+type);
	
	}

}
