public class ArrayList {

	public static void main(String[] args) 
	{
		String s="Welcome to Java";
		String s1="Learning Java";
		
//		Split method with space
//		String[] ss=s.split(" ");
//			
//		System.out.println(ss[0]);
//	    System.out.println(ss[1]);
//	    System.out.println(ss[2]);
//	    System.out.println("*************");	
////Split method with word and space
//String[] ss1=s.split(" to ");
//	
//System.out.println(ss1[0]);
//System.out.println(ss1[1]);
//System.out.println("*************split with space");
//
////Split method with word and NO space
//String[] ss2=s.split("to");
//
//System.out.println(ss2[0]);
//System.out.println(ss2[1]);
//System.out.println("*************to remove space before words trim used");
//
////trim method with remove space
//
//
//System.out.println(ss2[0].trim());
//System.out.println(ss2[1].trim());
//System.out.println("*************to print each character");
//
//for(int i=0;i<s.length();i++)
//{
//	System.out.println(s.charAt(i));
//}
System.out.println("reversed string");	
String reverse="";
for(int i=s.length()-1;i>=0;i--)
{
	reverse=reverse+s.charAt(i);
	
}
System.out.println(reverse);
}
}
