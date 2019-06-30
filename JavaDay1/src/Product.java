
public class Product {
	
	private float price = 5f;  // What is the better datatype for holding price  -> float / double / or something else.
	private float tax = 5f;  // private fields are accessible inside class instance
	public float tax1 = 5f;  // public fields are accessible outside class instance

	private int[] numArray = new int[] {1,2,3,4,5,6,7};
	
	
	
	public int findNumber(int num, int index) {
			if(numArray.length > index) {
				if(numArray[index] == num) {
					return num;
				}else {
					System.out.println("calling findNumber -> "+ index);
					return findNumber(num, index + 1);
				}
			}
		return  -1;
	}
	
	
	
	/**
	 * 
	 * @param price -  price of the product.
	 * @param tax - tax value
	 * @return - Calculated tax value.
	 */
	public float calculateTax(float price, float tax) {
		return price * tax;
	}
	
	public float calculateTax() {
		return price * tax;
	}

	public static void main (String[] var) {
		Product p = new Product();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("count -> " + i);
		}
		
		int i = 0;
		while(i < 10) {
			System.out.println("count -> " + i);
			i++;
		}
		
		i= 0;
		do {
			System.out.println("count -> " + i);
			i++;
		} while(i < 10);
		
		
		i= 0;
		switch(i) {
			case 1: System.out.println("case 1 -> " + i);
			break;
			
			case 2: System.out.println("case 2 -> " + i);
			break;
			
			case 3: System.out.println("case 3 -> " + i);
			break;
			
			default : System.out.println("default count -> " + i);
		}
		
		
		i= 0;   // set different values for i
		if( i < 3) {
			System.out.println("if -> " + i);
		} else if( i > 4) {
			System.out.println("else if -> " + i);
		} else {
			System.out.println("else -> " + i);
		}
		
		
		i= 0;
		// Operators :
		int   num1  = 10;
		int   num2  = 5;
		
		System.out.println(num1%num2);
		
		
		// recursion example.
		System.out.println("Find Number -> " + p.findNumber(20, 0));
	}
	
}
