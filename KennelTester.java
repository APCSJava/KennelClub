/**
 * Creates a kennel, populates it with pets and invokes allSpeak()
 * 
 * @author kentcollins (based on materials provided by the College Board)
 *
 */

public class KennelTester {

	public static void main(String[] args) {
		Kennel myKennel = new Kennel(10);
		
		myKennel.assignPet(0, new Cat("Copperfield"));
		myKennel.assignPet(1, new Cat("Blaine"));
		myKennel.assignPet(2, new Cat("Houdini"));
		myKennel.assignPet(3, new Cat("Ning"));
		myKennel.assignPet(4, new Cat("Angel"));
		myKennel.assignPet(5, new Dog("Vesuvius"));
		myKennel.assignPet(6, new Dog("Etna"));
		myKennel.assignPet(7, new Dog("Rainier"));
		myKennel.assignPet(8, new LoudDog("AndreTheGiant"));
		myKennel.assignPet(9, new LoudDog("JavaTheHutt"));
		
		myKennel.allSpeak();
		

	}

}
