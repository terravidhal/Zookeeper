public class MammalsTest {

	public static void main(String[] args) {
		//INSTANCES
		//Mammals mammal = new Mammals();
		Gorilla gorilla = new Gorilla();
		GiantBat giantBat = new GiantBat();
		
		// DISPLAY METHOD
		System.out.println("\n============= GORILLA ==============");
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
		gorilla.displayEnergy();
		System.out.println("\n============= GIANT BAT =============");
		giantBat.displayEnergy();
		giantBat.attackTowns();
		giantBat.attackTowns();
		giantBat.attackTowns();
		giantBat.eatHuman();
		giantBat.eatHuman();
		giantBat.fly();
		giantBat.fly();
		giantBat.displayEnergy();
		
	}

}
