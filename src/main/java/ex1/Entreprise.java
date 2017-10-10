package ex1;

import java.util.Date;


/** Représente une entreprise
 * @author ETY8
 *
 */
public class Entreprise {

	/** Siret : int  */  
	private int siret;
	
	/** Nom : String  */  
	private String nom;
	
	/** adresse : String  */  
	private String adresse;
	
	/** dateCreation : Date  */ 
	private Date dateCreation;
	
	
	  
	
	/** CAPITAL_MAX : int -> représente le capital maximum d'une entreprise */
	  
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 affiche le statut
	 */
	public void afficherstatut(){
		
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	


	
	
}
