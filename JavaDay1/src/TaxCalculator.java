
public class TaxCalculator {
	
	private Product p ;
	
	// Default Constructor
	public TaxCalculator() {}
	
	// Constructor
	public TaxCalculator(Product p) {
		this.p = p;
	}
	
	// Not a constructor.
	public void TaxCalculator(Product p) {
		this.p = p;
	}
	
	public void calculateTax() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(new Product());
		// access public field of Product outside product class.
		System.out.println(cal.p.tax1);		
		cal.calculateTax();		
	}
}
