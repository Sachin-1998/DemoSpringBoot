package PracticeStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTest {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,19,20,35,26,65,11,13,22);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(54);
		list1.add(67);
		list1.add(24);
		list1.add(18);
		list1.add(22);
		
		for(Integer i:list1)
		{
			if(i%2==0)
			{
				System.out.println(list1);
				break;
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		//using stream api
//		Stream<Integer> stream = list.stream();
//		List<Integer> newlist = stream.filter(i->i%2!=0).collect(Collectors.toList());
//		System.out.println(newlist);
//		
//		System.out.println("________________________________________");
//		
//		List<Integer> newlist1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println("Even Numbers: "+newlist1);
//		
//		
		
		Stream<Integer> stream=list.stream();
		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Before processing "+list);
		List<Integer> updatedNumbers= list.stream().map(n->n+1).collect(Collectors.toList());
		System.out.println(updatedNumbers);
		
		

	}

}

