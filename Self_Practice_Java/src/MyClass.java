
public class MyClass {

    static int lps(String s, int left, int right)
    {
       if (left > right) 
       {
           return 0;
       } 
       if(left == right)
       {
           return 1;
       }   
       if (s.charAt(left) == s.charAt(right) )
       {
           return 2 + lps(s,left+1,right-1);
       }
      int a=lps(s, left, right- 1);
      int b=lps(s, left + 1, right);
      return Math.max(a,b);
    }
   
   
   public static void main(String args[])
   {
     String s = "MOMFORMOM";
       int n = s.length();
       System.out.printf("The length of the LPS is %d",lps(s, 0, n-1));
   }
}
