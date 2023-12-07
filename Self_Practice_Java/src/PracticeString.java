import java.util.Set;

public class PracticeString {

	public static void main(String[] args) {
		String s ="Please email us at mentor@rahulshettyacademy.com with below template to receive response";
       String s1=s.split("at")[1].trim();
	   
	   //System.out.println(s1);
	  String s2=s1.split("with")[0];
	  System.out.println(s2);
	   }

	}






