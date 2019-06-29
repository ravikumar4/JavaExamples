
public class HelloWorld {

	private static int count;
	private int oneMoreCount;
	public int publicVariable;
	public int[] intArray = new int[]{1,2,3,4, 16,7,8,9};

	static {
		count = 0;
	}

	public void assignValue() {
		for (int i = 0; i < intArray.length; i++)  {
			intArray[i] = i;
			System.out.println("assignValue-> intArray[" + i + "] " + intArray[i]);
		}
	}
	
	public void printValue() {
		for (int i = 0; i < intArray.length; i++)  {
			System.out.println("assignValue-> intArray[" + i + "] " + intArray[i]);
		}
	}

	public void printValues() {
		System.out.println("printValues-> Count " + count);
		System.out.println("printValues-> oneMoreCount " + oneMoreCount);
	}

	public void addValue(int value1, int value2) {
		count = count + value1;
		oneMoreCount = oneMoreCount + value2;
	}

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		HelloWorld world = new HelloWorld();
//		HelloWorld world1 = new HelloWorld();
//
//		world.addValue(5, 6);
//		world.printValues(); // 5,6
//
//		world1.addValue(5, 6);
//		world1.printValues(); // 10, 6
//		world.printValues(); // 15?, 6 // 5?, 6 // 10, 6
//
//		System.out.println("main-> Count " + count);
//
//		System.out.println("main-> oneMoreCount " + world.oneMoreCount);
		
		
		HelloWorld example = new HelloWorld();
		example.printValue();
	}

}
