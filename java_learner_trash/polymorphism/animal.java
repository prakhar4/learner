public class animal
{
	protected int p;
	private String type;
	
	animal()
	{
		type=new String(" Mammoth ");
	}
	
	animal(String typ)
	{
		type=new String(typ);
	}
	
	public String toString()
	{
		return (" The type of animal is "+type);
	
	}
	
	public String sound()
	{return (" ");}

}
