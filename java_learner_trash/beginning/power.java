class power
{
  
  
 double pow(double x , int n)
	{
		if(n>0)
			return x*pow(x,n-1);
		else if (n<0)
			return 1/pow(x,-n);
		else 
			return (n==1)?x:1;
	
	}
}