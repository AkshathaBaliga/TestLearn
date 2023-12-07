import java.util.Scanner;

public class PalindromeClass {
     public static void main(String args[]) {

      String str,reverse="";

       Scanner sc=new Scanner(System.in);

       System.out.println("Enter String :");

       str = sc.nextLine();

       int length=str.length();

         for(int i=length-1 ; i>=0; i--)
       {
           reverse=reverse+str.charAt(i);

       }



       if(str.equals(reverse))
       {
          System.out.println(str + " is Palindrome");
       }
       else
       {
          System.out.println(str + " is Not Palindrome"); 
       }

     }
 }
