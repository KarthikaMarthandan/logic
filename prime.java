package package1;

public class prime
{
	public prime(int n)
	{
		int c=0,i;
		if(n==1)
		System.out.println("Given no is neither prime not Composite");
		else if(n==2)
		System.out.println("Given no is prime");
		else
		{
			for(i=2;i<n/2;i++)
			{
				if(n%i==0)
				c++;	
			}
		}
		if(c==0)
			System.out.println("The no is prime :"+n);
		else
			System.out.println("The no is not prime:"+n);
	}

}
