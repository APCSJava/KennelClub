
/**
 * Superclass of household pets.
 * 
 * @author kentc14 (based on materials provided by the College Board)
 *
 */
public abstract class Pet {
	private String myName;
	
	public Pet(String name) {
		myName = name;
	}
	
	public String getName(){
		return myName;
	}
	
	public abstract String speak();

}
