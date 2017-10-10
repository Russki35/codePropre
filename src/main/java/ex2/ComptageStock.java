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
	  
	/** type : String  */
	  private String type;
	
	public void ajouterElement(int montant){
		nb++;
		resultat +=montant;
	}
	
	
	public void afficheStatutComptage(TypeComptage typeComptage){
		if(nb == 0){
			throw new RuntimeException("Le comptage contient aucun élément.");
		}
		affichageResultat();
		affichageDateDebut();
		affichageDateFin();
		
	}


	/** Affiche le statut du comptage
	 * @param typeComptage SOMME ou MOYENNE
	 */
	private void affichageResultat() {
		if (type!=null && type.equals(TypeComptage.SOMME)){
			System.out.println("Ce comptage est de type SOMME");
			System.out.println("Nombre d'élements "+nb);
			
			System.out.println("Résultat "+resultat);
		}
		else if (type!=null && type.equals(TypeComptage.MOYENNE)){
			System.out.println("Ce compte est de type MOYENNE");
			System.out.println("Nombre d'élements "+nb);
			
			System.out.println("Résultat "+resultat/nb);
		}
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
