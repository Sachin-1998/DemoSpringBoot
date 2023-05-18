package typesFunctionalinterface;

import java.util.function.Consumer;

public class typeConsumerinterface implements Consumer<String> 
{
	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());

	}

	public static void main(String[] args) 
	{
		//public abstract void accept(T);
		//accept single input argument and return no result
		System.out.println("Without using lamda");
		Consumer<String> consumer=new typeConsumerinterface();
		consumer.accept("My name is sachin");
		System.out.println("++++++++++++++++++++++");
		System.out.println("Without using lamda");
		Consumer<String> con=(convert)->System.out.println(convert.toLowerCase());
		con.accept("My NaME IS SACHIN..");
		
		

	}

}
