package garageAvecMenu;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		// Créer 3 instances de Voiture
		// Voiture1 : Bugatti , Chiron, 2 places, essence
		// Voiture2 : Mercedes, Maybach S 600 , 4 places, essence
		// Voiture3 : Citroën, C3 Picasso, 5 places, diesel
		Voitures v1 = new Voitures("Bugatti", "Chiron", 2, "essence");
		Voitures v2 = new Voitures("Mercedes", "Maybach S 600", 4, "essence");
		Voitures v3 = new Voitures("Citroën", "C3 Picasso", 5, "diesel");
		// Créer 2 instances de Moto
		// Moto1 : Kamasaki, GTR 1400, 1400 cc
		// Moto2 : Honda, CB 600, 600 cc
		Motos m1 = new Motos("Kamasaki", "GTR 1400", 1400);
		Motos m2 = new Motos("Honda", "CB 600", 600);
		// mise dans la liste "garage" de tous les véhicules
		Véhicules.garage.add(v1);
		Véhicules.garage.add(v2);
		Véhicules.garage.add(v3);
		Véhicules.garage.add(m1);
		Véhicules.garage.add(m2);
		// ajout du garage dans la liste des véhicules disponibles afin de l'initialisée
		Véhicules.disponibles.addAll(Véhicules.garage);
		//ouverture du menu
		Menu menu =new Menu();
		menu.principal();
		
	}

	public static void sauterLigne() {
		System.out.println(" ");
	}
}
