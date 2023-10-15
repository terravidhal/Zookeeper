public class GiantBat extends Mammals {

	//CONSTRUCTOR
	public GiantBat() {
		super(300);
	}

	//OTHERS METHODS
	public void fly() {
		this.setEnergy(getEnergy()-50);
		System.out.println("the bat is in the air");
	}
	public void eatHuman() {
		this.setEnergy(getEnergy()+25);
		System.out.println("the bat whistles with joy");
	}
	public void attackTowns() {
		this.setEnergy(this.getEnergy()-100);
		System.out.println("the bat attacks");
	}
}
