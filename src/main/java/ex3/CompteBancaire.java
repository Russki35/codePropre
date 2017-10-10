package ex3;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	protected double tauxRemuneration;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;
	
	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;

		
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	
	
	public void debiterMontant(double montant){
		
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		
		
	}
	
	

	
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
