class test
{
	public static void main(String[] args)
	{

	rectangle r1,r2,r3,res,result;
	
	r1=new rectangle(2,10,6,1);
	r2=new rectangle(1,9,5,2);
	r3=new rectangle(4,6,7,0);
	
	res=r1.enclose(r2);
	//result=new rectangle(res);
	res=res.enclose(r3);
	
	System.out.println("the final rectangle is "+res);
	}
	
	


}
