
class Frog {
	String name;
	int age;
	
	public void setName(String name){
//		this refers to the instance scope name 
		this.name = name;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
}
public class app {
	public static void main(String[] args) {
//		Frog frog1 = new Frog();
////		frog1.name = "asd";
////		frog1.age = 23;
//		frog1.setAge(23);
//		frog1.setName("Pepe");
//		
//		System.out.println(frog1.getName());
			
	}

}
