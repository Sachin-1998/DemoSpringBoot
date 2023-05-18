package PracticeStreamApi;

import java.util.List;
import java.util.stream.Stream;

public class TestTwo {

	public static void main(String[] args) {
		
		String [] names= {"sagar","Rohan","sameeksha","somnath","gopinath"};
		
		Stream<String> name = Stream.of(names);
		name.forEach(e->{System.out.println(e);});
		
		System.out.println("++++++++++++++++++++++++++++++");
//		
		List<Integer> list = List.of(23,45,78,90,34,22);
//		Stream<Integer> stream = list.stream();
//		stream.forEach(e->{System.out.println(e);});
		Stream<Integer> stream=list.stream();
		stream.forEach(System.out::println);
		
		

	}
	

}
