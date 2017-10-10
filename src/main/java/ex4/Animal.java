/**
 * 
 */
package ex4;

/**
 * @author ETY8
 *
 */
public class Animal {
	
	 private String AnimalTypes;
	 private String AnimalNoms;
	 private String AnimalComportements;

	public Animal(String AnimalTypes, String AnimalNoms, String AnimalComportements){
		this.AnimalTypes = AnimalTypes;
		this.AnimalNoms = AnimalNoms;
		this.AnimalComportements = AnimalComportements;
	}
	
	
	
	public enum comportement {
		CARNIVORE, HERBIVORE;
	}

	public String getAnimalTypes() {
		return AnimalTypes;
	}

	public void setAnimalTypes(String animalTypes) {
		AnimalTypes = animalTypes;
	}

	public String getAnimalNoms() {
		return AnimalNoms;
	}

	public void setAnimalNoms(String animalNoms) {
		AnimalNoms = animalNoms;
	}

	public String getAnimalComportements() {
		return AnimalComportements;
	}

	public void setAnimalComportements(String animalComportements) {
		AnimalComportements = animalComportements;
	}

}
