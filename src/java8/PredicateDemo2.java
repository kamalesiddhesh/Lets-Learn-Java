package java8;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArray = {"Siddhesh","Tanuja", "Vikrant", "Raj","Raga"};
		Predicate<String> p = s->s.length()>5;
		for(String s1:sArray) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
		
		
	}

}
