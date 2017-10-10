package ex3;

public class LivretA extends CompteBancaire {

	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
		
		
	}
	
	public void appliquerRemuAnnuelle(){
		if (type.equals("LA")){
			this.solde = solde + solde*tauxRemuneration/100;
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