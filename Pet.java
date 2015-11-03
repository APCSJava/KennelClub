/**
 * Superclass of household pets.
 * 
 * @author kentc14
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
