package garageAvecMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	static int choixU;
	static Scanner sc = new Scanner(System.in);
	// Exercice 5
	// Copier le projet précédent pour repartir de la même base. Mettre en place un
	// menu permettant de choisir de saisir
	// l'action à effectuer parmi les actions reserver() et restituer().
	// Si l'action est reserver : afficher la liste des véhicules disponibles et
	// attendre la saisie de l'identifiant du véhicule à
	// réserver pour finaliser la réservation.
	// Si l'action est restituer : afficher la liste des véhicules en cours
	// d'utilisation et attendre la saisie de l'identifiant du
	// véhicule à restituer pour finaliser la restitution.
	// Après chacune des actions ci-dessus : afficher le nombre de véhicules
	// disponibles et revenir au menu

	public Menu() {
	}

	public void principal() {
		Main.sauterLigne();
		System.out.println("      **  MENU PRINCIPAL  **  ");
		Main.sauterLigne();
		System.out.println("Veuillez séléctionner votre menu");
		System.out.println("1. RESERVATION DE VEHICULE");
		System.out.println("2. RESTITUTION DE VEHICULE");
		System.out.println("3. LISTE DES VEHICULES DU GARAGE");
		System.out.println("4. LISTE DES VEHICULES DISPONIBLES");
		// la boucle sert a verifier les execption non gérer par le menu
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				choixU = sc.nextInt();
				switch (choixU) {
				case 1:
					reserver();
					break;
				case 2:
					restituer();
					break;
				case 3:
					listeVehicule();
					break;
				case 4:
					listeDispo();
					break;
				default:
					System.out.println("Vous avez mal saisi votre choix");
					principal();
					break;
				}
			} else {
				System.out.println(sc.next() + " N'es pas répertorié, veuillez resaisir votre choix");
				principal();
			}
		}

	}

	public void reserver() {
		if (Véhicules.disponibles.size() == 0) {
			System.out.println("Aucun véhicule  disponible, retour au menu principal");
			principal();
		}
		// else
		System.out.println("Voici la liste des Véhicules disponibles");
		for (int i = 0; i < Véhicules.disponibles.size(); i++) {
			Véhicules.disponibles.get(i).details();
		}

		System.out.println("Séléctionner votre véhicule");
		System.out.println("1 : Retour au menu principal");
		for (int i = 0; i < Véhicules.disponibles.size(); i++) {
			System.out.println((i + 2) + " : " + Véhicules.disponibles.get(i).getMarque() + " "
					+ Véhicules.disponibles.get(i).getModele());
		}
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				choixU = sc.nextInt();
				if (choixU == 1) {
					principal();
				} else if (choixU < Véhicules.disponibles.size() + 2) {
					Véhicules.disponibles.get(choixU - 2).reserver();
					principal();
				}
			} else {
				System.out.println(sc.next() + "N'es pas répertorié, veuillez resaisir votre choix");
				reserver();
			}

		}
	}

	public void restituer() {
		if (Véhicules.reserve.size() == 0) {
			System.out.println("Aucun véhicule  à restituer, retour au menu principal");
			principal();
		}
		System.out.println("Bonjour, quel véhicule êtes-vous venu nous rendre ?");
		System.out.println("1 : Retour au menu principal");

		for (int i = 0; i < Véhicules.reserve.size(); i++) {
			System.out.println((i + 2) + " : " + Véhicules.reserve.get(i).getMarque() + " "
					+ Véhicules.reserve.get(i).getModele());
		}
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				choixU = sc.nextInt();

			} else {
				System.out.println(sc.next() + "N'es pas répertorié, veuillez resaisir votre choix");
				restituer();
			}

			if (choixU == 1) {
				principal();
			} else if (Véhicules.reserve.size() > choixU - 2) {
				Véhicules.reserve.get(choixU - 2).restituer();
				principal();
			}
		}
	}

	public void listeVehicule() {
		for (int i = 0; i < Véhicules.garage.size(); i++) {
			Véhicules.garage.get(i).details();
		}
		Main.sauterLigne();
		principal();
	}

	public void listeDispo() {
		for (int i = 0; i < Véhicules.disponibles.size(); i++) {
			Véhicules.disponibles.get(i).details();
		}
		Main.sauterLigne();
		principal();
	}

}
