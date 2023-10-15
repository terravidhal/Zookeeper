public class Gorilla extends Mammals{

	//CONSTRUCTOR
	public Gorilla() {
		super();
	}

	//OTHERS METHODS
	public void throwSomething() {
		this.setEnergy(this.getEnergy()-5);
		System.out.println("the gorilla throws an object");
	}
	public void eatBananas() {
		this.setEnergy(getEnergy()+10);
		System.out.println("the gorilla jumps for joy");
	}
	public void climb() {
		this.setEnergy(getEnergy()-10);
		System.out.println("the gorilla climbs a tree");
	}
	
}
