import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamsDemo {

	public static void main(String[] args) {
		
//to get the integer of array as a list and get the unique numbers andsort it.
		List<Integer> values =Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
//		To get distinct sorted integer values in a list and the index of 3
		List<Integer> indvalue=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("index value of 2=  "+indvalue.get(2));
	}
}
		
		
		
		
		
		
//
//		//Using Stream of strings-pick only two names ends with a and display the list of string it in lowercase 
//		//Using Collect(collectors.toList());
//		List<String> newlist=Stream.of("Akshatha","Vihaan","Vijendra","Vandana", "Baliga").filter(s->s.endsWith("a")).
//		map(s->s.toLowerCase()).collect(Collectors.toList());
//		System.out.println(newlist);
//	
//
//		//Using Stream of strings-pick only two names ends with a and display the list of string it in lowercase 
//	//using limit and Foreach();
//
//	Stream.of("Akshatha","Vihaan","Vijendra","Vandana", "Baliga").filter(s->s.endsWith("a")).
//		map(s->s.toLowerCase()).limit(2).forEach(s->System.out.println(s));
//	
	
	
	
	
	
//		System.out.println(newlist);
//		String a= "Vihaan is a good boy . Vihaan is brilliant";
//		String spl[]=a.split(" ");
//	
//		List<String> strarry= Arrays.asList(spl);
//		
//		System.out.println(strarry);
//		
//		boolean result=strarry.stream().anyMatch(s->s.equalsIgnoreCase("vihaan"));
//		Assert.assertTrue(result);
//	    
//		System.out.println(result);
		
		
		
		
	   
		
//		List<String> names = (List<String>) Arrays.asList(a).listIterator(); // normal string to arrayList
		
		
//		System.out.println(names);
		
		
		
		
		
		
		
//		String a[] = { "Akshatha", "Vihaan", "Vijendra", "Vandana", "Baliga" };
//		List<String> names = Arrays.asList(a); // normal string to arrayList
//
//		String b[] = { "Prabhu", "Shanbhag", "Pai", "Kini" };
//		List<String> names1 = Arrays.asList(b); // normal string to arrayList
//
//		Stream<String> mergedString = Stream.concat(names.stream(), names1.stream());// both are the merged here usingStream.concat(a.stream,b.stream)
//																					
//		mergedString.sorted().forEach(s -> System.out.println(s)); // here merged stream is sorted and printed on console
////																
//
//	}
//}

////To print name Vihaan ignoring the case and count it
//Long c= Stream.of("Akshatha","Vihaan","Vijendra","Vandana","Baliga").filter(s->s.equalsIgnoreCase("vihaan")).count();
//System.out.println(c);
//
////To print names starts with V->limit it 2->in uppercase using map and display using foreach
//names.stream().filter(s->s.startsWith("V")).limit(3).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//
//
////sort the above list
//System.out.println("After sorting \n");
//
//names.stream().filter(s->s.startsWith("V")).map(s->s.toUpperCase()).limit(3).sorted().forEach(s->System.out.println(s));