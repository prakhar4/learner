public class cat extends animal
{
	private String name;
	private String breed;
	
	
	cat()
	{					//IF NO CONSTRUCTOR OF BASE CLASS IS INVOKED THEN THE DEFAULT OF BASE IS INVOKED BY COMPILER
						//BUT IT HAS TO BE THE DEFALUT CONSTRUCTOR ONLY
					   //		THE CONSTRUCTOR OF THE BASE CLASS IS NOT INHERITED--- HENCE CANNOT CALL THIS WAY
		super("cat");	     //		THIS IS CORRECT WAY--- 
		name="default";
		breed="unknown";
		p=1;
	}	
	
	cat(String n, String b)
	{
		this();				//IT IS TO CALL THE ABOVE CONTRUCTOR OF SAME CLASS
		//super("cat");			/*CAN USE EITHER OF THE TWO STATEMENTS */
		name=new String(n);
		breed=new String(b);
		p=2;
	}
	
	cat(String n)
	{
		this();
		//super("cat");
		name=new String(n);
		breed="unknown";
		p=3;
	}
	
	public String sound()
	{
		return (" it create mew mew");
	}
	
	public String toString()		//cannot give this as private as it has to be more realxed than base class
	{
		return (super.toString()+" its name is "+name+" its breed is "+breed+" and identy num is "+p);
												//HOW TO USE THE MEMBERS WITH SAME NAMES IN THE BASE CLASS
												//USE THE super.membername
												//ELSE ONLY THE MEMBER FUNCTION OF THIS CLASS IS INVOKED
												
												
	}	
}
