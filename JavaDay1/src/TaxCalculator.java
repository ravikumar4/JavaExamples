
public class TaxCalculator {
	
	private Product p ;
	
	// Default Constructor
	public TaxCalculator() {}
	
	// Constructor
	public TaxCalculator(Product p) {
		this.p = p;
	}
	
	
	public void TaxCalculator(Product p) {
		this.p = p;
	}
	
	public void calculateTax() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(new Product());
		cal.calculateTax();
		
	}

}
