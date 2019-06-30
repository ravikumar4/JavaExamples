import java.util.ArrayList;
import java.util.List;

public class Student {
	int rollnumber;
	int classNumber;
	String name;
	Product p;
	List list;
	Sex sex;
	
	public void method() {
		System.out.println("test");
	}
}

enum Sex {
	MALE, FEMALE;
	
	void checkValue() {
		System.out.println("test");
	}
}


