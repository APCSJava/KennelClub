/**
 * Holds an array of pets.
 * 
 * @author kentc14
 *
 */
public class Kennel {

	private Pet[] kennel;
	
	public Kennel(int cages){
		kennel = new Pet[cages];
	}
	
	public void assignPet(Pet p, int cage) {
		if (kennel[cage]==null) {
			kennel[cage] = p;
		}
	}
	
	public void allSpeak() {
		for (Pet p: kennel) {
			System.out.println(p.getName()+"\t"+p.speak());
		}
	}
	
}
