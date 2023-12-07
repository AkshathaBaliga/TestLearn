//Print all subsequences of a string

public class StringSubseq {

	public static void main(String[] args) {
		String str = "akshatha";
        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<= str.length(); j++)
            {
                System.out.println(str.substring(i,j));
                
            }
        }



	}

}
