class Person {
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is " + name);
	}
	
	int calculateYearsToRetirement(){
		int yearsLeft = 65 - age ;
		
//		System.out.println(yearsLeft);
		
		return yearsLeft;
	}
}
public class app {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age = 25;
		person1.name = "Daniel";
		
		person1.speak();
		
		int years = person1.age;
		System.out.println(years + " Years left till retirement");
	}
}
