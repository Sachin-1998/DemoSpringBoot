package typesFunctionalinterface;

import java.util.function.Function;

public class type1Function implements Function<Integer,Integer>
{
	@Override
	public Integer apply(Integer num) {
		
		return num*num;
	}

	public static void main(String[] args) {
		//Stream.map is the example of Function interface.
		//public abstract R apply(T);
		//accept one arg "T" and produces result "R"
		System.out.println("Without lamda function");
		Function<Integer, Integer> fun=new type1Function();
		System.out.println(fun.apply(10));
		
		System.out.println("With Lamda function..");
		Function<Integer, Integer> function=(num)->num*num;
		System.out.println(function.apply(20));

	}

	

}
