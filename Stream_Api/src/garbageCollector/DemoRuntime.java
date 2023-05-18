package garbageCollector;

import java.util.Date;

public class DemoRuntime 
{
	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		long mb=1024*1024;
		System.out.println("Total memory "+r.totalMemory()/mb);
		System.out.println("Free Memory "+r.freeMemory()/mb);
		for (int i = 0; i < 100; i++) 
		{
			Date d=new Date();
			d=null;
		}
		System.out.println("Free Memory "+r.freeMemory()/mb);
		r.gc();
		System.out.println("Free Memory "+r.freeMemory()/mb);

	}

}
