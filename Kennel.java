/**
 * Holds an array of pets.
 * 
 * @author kentc14
 *
 */
public class Kennel {

	private Pet[] kennel;
	
	public Kennel(int numCages){
		kennel = new Pet[numCages];
	}
	
	public void assignPet(int cageNumber, Pet p) {
		// check if requested cage is empty
		if (kennel[cageNumber]==null) {
			kennel[cageNumber] = p;
		}
	}
	
	public void allSpeak() {
		for (Pet p: kennel) {
			System.out.println(p.getName()+"\t"+p.speak());
		}
	}
	
}
