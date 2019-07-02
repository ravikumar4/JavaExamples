import java.math.BigDecimal;

public class RoundingOffExample {

	// Not suitable for currency and fields where precision is important.
	public static void roundingChekWithDouble() {
		double a = 0.7;
		double b = 0.9;
		double x = a + 0.1;
		double y = b - 0.1;

		System.out.println("roundingChekWithDouble -> x = " + x);
		System.out.println("roundingChekWithDouble -> y = " + y);
		System.out.println(x == y);
	}
	
	// Not suitable for currency and fields where precision is important.
	public static void roundingChekWithFloat() {
		float a = 0.7f;
		float b = 0.9f;
		float x = a + 0.1f;
		float y = b - 0.1f;

		System.out.println("roundingChekWithFloat -> x = " + x);
		System.out.println("roundingChekWithFloat -> y = " + y);
		System.out.println(x == y);
	}
	
	// BigDecimal should be used for currency and fields where precision is important.
	public static void roundingChekWithBigDecimal() {
		BigDecimal a = BigDecimal.valueOf(0.7);
		BigDecimal b = BigDecimal.valueOf(0.9);
		
		BigDecimal x = a.add(BigDecimal.valueOf(0.1));
		BigDecimal y = b.subtract(BigDecimal.valueOf(0.1));

		System.out.println("roundingChekWithBigDecimal -> x = " + x);
		System.out.println("roundingChekWithBigDecimal- >y = " + y);
		System.out.println(x.equals(y));
	}

	public static void main(String[] args) {
		roundingChekWithDouble();
		roundingChekWithDouble();
		roundingChekWithBigDecimal();
	}

}
