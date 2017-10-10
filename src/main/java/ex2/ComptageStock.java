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
	
	/** Affiche le statut du comptage
	 * @param typeComptage SOMME ou MOYENNE
	 */
	public void afficheStatutComptage(TypeComptage typeComptage){
		
		affichageResultat();
		
		if (dateDebutComptage!=null){
			
			System.out.println(DateUtils.format(dateDebutComptage));
		}
		
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le " + DateUtils.format(dateFinComptage));
			if (nb==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}

	/**
	 * 
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
	
	
}
