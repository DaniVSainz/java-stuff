package polymorphism;

public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
//		This works but we morphed grow
		plant2.grow();
		
		tree.shedLeaves();
		
		//Type of variable decides what types of methods you can call 
//		plant2.shedLeaves();
		doGrow(tree);

	}
	public static void doGrow(Plant plant){
		plant.grow();
	}
	
}
