//Count Distinct Subsequences


public class CountSubSequence 
{

	public static void main(String[] args) 
	{
		String s = "abc";
		String subStr=null;
		int count=0;
		for(int i=0; i<=s.length(); i++)
		{
	     for(int j=i+1; j<=s.length(); j++)
		  {
		   subStr = s.substring(i,j);
		   System.out.println(subStr);
		   count++;
		  }
		}
		
		//count = subStr.length();
		System.out.println("Distinct substing count is :"+count);
		//System.out.println();

	}

}
