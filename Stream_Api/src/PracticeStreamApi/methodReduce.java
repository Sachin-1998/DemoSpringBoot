package PracticeStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methodReduce
{
	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,6,5,12,4,2);
		System.out.println("Reduce+++++++++++++++++++++++++++++++");
		Integer res = list.stream().reduce(0, (sum,i)->sum+i);
		System.out.println("Addition "+res);
		
		System.out.println("Map++++++++++++++++++++++++++++++++++");
		
		list.stream().map(num->num+num).forEach(add->System.out.println(add));
		
		System.out.println("Filter++++++++++++++++++++++++++++++++++++");
		
		Integer [] a= {12,34,21,56,43,67,33};
		Stream<Integer> numbers = Arrays.stream(a);
		List<Integer> result = numbers.filter(i-> i<=20).map(x->x+5).collect(Collectors.toList());
		System.out.println("result "+result);
		
		
	}

}
