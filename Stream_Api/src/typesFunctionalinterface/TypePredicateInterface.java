package typesFunctionalinterface;

import java.util.function.Predicate;

public class TypePredicateInterface implements Predicate<String>{

	public static void main(String[] args) 
	{
		
		System.out.println("Without lamda");
		Predicate<String> res=new TypePredicateInterface();
		System.out.println(res.test("he is an excellent guy in our company"));
		System.out.println("Without lamda");
		Predicate<String> res1=(s)->s.length()<=1;
		System.out.println(res1.test("How are You?"));


	}

	@Override
	public boolean test(String t) {
		
		return t.length()>5;
	}

}
