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
	
	
	
	protected List<String> types;
	protected List<String> noms;
	protected List<String> comportements;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}

}
