package recursion;

public class SumOfNaturalNumbers {
	
	public static int sumOfNatural(int start, int end,int sum)
	{
		if(start>end)
		{
			return sum;
		}
		else {
			sum+=start;
		}
		return sumOfNatural(++start,end,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=1;
		int end=5;
		int sum=0;
		System.out.println(sumOfNatural(start,end,sum));

	}

}
