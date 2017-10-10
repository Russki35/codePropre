package ex2;

public class AppComptageStock {

	public static void main(String[] args) {
		
		ComptageStock stock = new ComptageStock();
		stock.ajouterElement(10);
		stock.ajouterElement(5);
		stock.afficheStatutComptage(TypeComptage.MOYENNE);
	}

}
