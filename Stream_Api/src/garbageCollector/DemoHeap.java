package garbageCollector;

public class DemoHeap {

	public static void main(String[] args) 
	{
		//1 KB = 1024 Bytes
		//1MB = (1024*1024) Bytes
		long mb = 1024*1024;
		Runtime r = Runtime.getRuntime();
		System.out.println("Max Memory: "+r.maxMemory()/mb);
		System.out.println("Total Memory: "+r.totalMemory()/mb);
		System.out.println("Free Memory: "+r.freeMemory()/mb);
		System.out.println("Consumed memory:"+(r.totalMemory()-r.freeMemory())/mb);

	}

}
