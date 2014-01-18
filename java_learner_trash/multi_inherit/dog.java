public class dog extends animal
{
	private String name;
	private String breed;
	animal d1;
	
	dog()
	{					//IF NO CONSTRUCTOR OF BASE CLASS IS INVOKED THEN THE DEFAULT OF BASE IS INVOKED BY COMPILER
						//BUT IT HAS TO BE THE DEFALUT CONSTRUCTOR ONLY
		//animal("dog");		THE CONSTRUCTOR OF THE BASE CLASS IS NOT INHERITED--- HENCE CANNOT CALL THIS WAY
		super("dog");			//THIS IS CORRECT WAY--- 
		name="default";
		breed="unknown";
		p=1;
	}	
	
	dog(String n, String b)
	{
		this();				//IT IS TO CALL THE ABOVE CONTRUCTOR OF SAME CLASS
		//super("dog");			/*CAN USE EITHER OF THE TWO STATEMENTS */
		name=new String(n);
		breed=new String(b);
		p=2;
	}
	
	dog(String n)
	{
		this();
		//super("dog");
		name=new String(n);
		breed="unknown";
		p=3;
	}
	
	public String sound()
	{
		return (" it create bhow bhow ");
	}
	
	public String toString()		//cannot give this as private as it has to be more realxed than base class
	{
		return (super.toString()+" its name is "+name+" its breed is "+breed+" and identy num is "+p);
												//HOW TO USE THE MEMBERS WITH SAME NAMES IN THE BASE CLASS
												//USE THE super.membername
												//ELSE ONLY THE MEMBER FUNCTION OF THIS CLASS IS INVOKED
												
												
	}	
}
