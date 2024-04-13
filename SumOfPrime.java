package recursion;

public class SumOfPrime {
	
	public static int count(int first,int i,int count)
	{
		if(i>first)
		{
			return count;
		}
		else if(first%i==0)
		{
			count++;
		}
		return count(first,++i,count);
		
	}
	public static int prime(int first,int last,int sum)
	{
		if(first>last)
		{
			return sum;
		}
		else if(count(first,1,0)==2)
		{
			sum+=first;
		}
		return prime(++first,last,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(2,10,0));

	}

}
