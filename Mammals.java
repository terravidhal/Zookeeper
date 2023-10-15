public class Mammals {
	//MEMBERS VARIABLES
	private int energy;

	//CONSTRUCTOR
	public Mammals() {
		this.energy=100;
	}
	//OVERLOADER CONSTRUCTOR
	public Mammals(int energyValue) {
		this.energy = energyValue;
	}

	//GETTERS
	public int getEnergy() {
		return energy;
	}
	//SETTERS
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	//OTHERS METHODS
	public int displayEnergy() {
		System.out.println("This animal's energy is: " + this.getEnergy());
		return this.getEnergy();
	}
}
