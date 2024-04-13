package recursion;

public class NaturalNumbers {
	public static void natural(int start,int end)
	{
		if(start>end)
		{
			return;
		}
		else
		{
			System.out.println(start);
		}
		natural(++start,end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		int end=5;
		natural(start,end);
		

	}

}
