public class trialpoly
{
	public static void main(String[] args)
	{
		int i;
		
		animal[] anim={
			   new dog("tommy","alsesian"),
			   new cat("billi","kitten"),
			   new duck("batak")
			 };

				
		animal choice;
		
		for(i=0;i<5;i++)
		{
			choice= anim[(int)(Math.floor(Math.random()*(anim.length)))];
			
			System.out.println(choice);
			System.out.println(choice.sound());
		
		}
		
		
	
	}

}
