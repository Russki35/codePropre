package ex3;

public class LivretA extends CompteBancaire {

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
		
		
	}
	
	public void appliquerRemuAnnuelle(){
		
			this.solde = solde + solde*tauxRemuneration/100;
		
	}
	
	@Override //Indique que l'on réécrit une méthode de la classe mère
	public void debiterMontant(double montant){
		
		
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		
	}
	
	
	

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 *           
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}