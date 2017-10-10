/**
 * 
 */
package ex4;

import java.util.ArrayList;
import java.util.List;
/**
 * @author ETY8
 *
 */
public class Zone  {
	
	protected List<Animal> animaux;
	

	
	
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
		
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal : animaux){
			System.out.println(animal.getNom());
		}
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}

}
