package recursion;

public class Factorial {
	
	public static int factorial(int num,int fact)
	{		
		if(num==0)
		{
			return fact;
		}
		else
		{
			fact*=num;
		}
		return factorial(--num,fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact=1;
		System.out.println(factorial(num,fact));

	}

}
