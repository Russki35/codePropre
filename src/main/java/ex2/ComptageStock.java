package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComptageStock {

	/** nb : int  */
	  private int nb;
	  
	/** resultat : int  */
	  private int resultat;
	  
	/** dateDebutComptage : Date  */
	  private Date dateDebutComptage;
	  
	/** dateFinComptage : String  */
	  private Date dateFinComptage;
	  

	
	public void ajouterElement(int montant){
		nb++;
		resultat +=montant;
	}
	
	
	public void afficheStatutComptage(TypeComptage typeComptage){
		if(nb == 0){
			throw new RuntimeException("Le comptage contient aucun élément.");
		}
		affichageResultat(typeComptage);
		affichageDateDebut();
		affichageDateFin();
		
	}


	/** Affiche le statut du comptage
	 * @param typeComptage SOMME ou MOYENNE
	 */
	private void affichageResultat(TypeComptage type) {
		if (type!=null && type.equals(TypeComptage.SOMME)){
			
			affichertype(type, resultat);
			
		}
		else if (type!=null && type.equals(TypeComptage.MOYENNE)){
			
			affichertype(type, resultat/nb);
		}
	}
	
	private void affichertype(TypeComptage type, double resultat){
		System.out.println("Ce comptage est de type "+type);
		System.out.println("Nombre d'élements "+nb);
		System.out.println("Résultat "+resultat);
	
	}
	
	
	private void affichageDateDebut(){
		if(dateDebutComptage!=null){
		System.out.println(dateDebutComptage);
		}
	}
	
	private void affichageDateFin(){
		if(dateFinComptage!=null){
		System.out.println(dateFinComptage);
		}
	}
	
}
