package recursion;

public class Fibonossis {
	
	public static void fibo(int a,int b,int start,int range)
	{
		if(start>range)
		{
			return;
		}
		else
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
		fibo(a,b,++start,range);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0+"\n"+1);
		fibo(0,1,1,10);
		

	}

}
