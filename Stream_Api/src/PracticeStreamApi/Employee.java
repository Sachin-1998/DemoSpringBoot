package PracticeStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee 
{

	private Integer eid;
	private String eName;
	private Double eSalary;
	
	
	public Employee(Integer eid, String eName, Double eSalary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSalary = eSalary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}


	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(10, "Ram", 25000.0));
		empList.add(new Employee(13, "Ganesh", 44000.0));
		empList.add(new Employee(16, "somu", 35000.0));
		empList.add(new Employee(8, "gomu", 76000.0));
		empList.add(new Employee(5, "Ramesh", 37000.0));
		System.out.println("Before processing "+empList.toString());
		System.out.println("+++++++++++++++++++++++++++");
		empList.stream().filter(n-> n.eSalary==44000).forEach(name-> System.out.println(name.eName));
		System.out.println("filter().Map().forEach()++++++++++++++++++++++++");
		empList.stream().filter(s->s.eSalary<30000.0).map(m->m.eSalary+3000.0)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("++++++++++++++map() and reduce()+++++++++");
		Optional<Double> totalEmpSalary = empList.stream().map((m)->m.eSalary).reduce((sum,i)-> sum+i);
		System.out.println("Total emp sal "+totalEmpSalary);
		


	}

}
