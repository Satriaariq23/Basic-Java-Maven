import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increments(5);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrements(3);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.multiplys(1);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
