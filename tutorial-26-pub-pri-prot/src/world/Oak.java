package world;

public class Oak extends Plant {
	
	public Oak(){
//		type = "tree" wont work type is private
//		this does size is protected and is a subclass so it's allowable
		size = "large";
//		System.out.println(size);
	}
}
