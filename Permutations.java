package recursion;

public class Permutations {
	
	public static String swap(String str,int i,int j)
	{
		char [] ch= str.toCharArray();
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String res= new String(ch);
		return res;
	}
	
	public static void permulation(String str,int start,int end)
	{
		if(start==end)
		{
			System.out.println(str);
			return;
		}
		else
		{
			for(int i=start;i<=end; i++)
			{
				String str1=swap(str,start,i);
				permulation(str1,start+1,end);
			}
		}
	}
	public static void main(String[] args) {
		permulation("abc",0,2);
	}
}