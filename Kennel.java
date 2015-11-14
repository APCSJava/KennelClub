/**
 * Holds an array of pets.  The constructor and additional methods have been
 * provided for you.  You need to implement the allSpeak() method ONLY.
 * 
 * @author kentc14 (based on materials provided by the College Board)
 *
 */
public class Kennel {

	private Pet[] cages;
	
	public Kennel(int numCages){
		cages = new Pet[numCages];
	}
	
	public void assignPet(int cageNumber, Pet p) {
		// check if requested cage is empty
		if (cages[cageNumber]==null) {
			cages[cageNumber] = p;
		}
		// Note: consider throwing an error if unsuccessful?
	}
	
	public void allSpeak() {
		// TODO to be written by student
	}
	
}
