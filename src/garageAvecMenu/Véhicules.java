package garageAvecMenu;

import java.util.*;

public class Véhicules {
	
	private String marque;
	private String modele;
	private static int compteur=0;
	public static ArrayList<Véhicules>garage = new ArrayList<Véhicules>();
	public static ArrayList<Véhicules>disponibles = new ArrayList<Véhicules>();
	public static ArrayList<Véhicules>reserve = new ArrayList<Véhicules>();
	
	//constructeur par default
	public Véhicules() {
	}
	//constructeur 
	public Véhicules(String marque, String modele) {
		super();
		this.marque = marque;
		this.modele = modele;
		setCompteur(getCompteur() + 1);
	}
	//creation d'une methode pour afficher les attributs des véhicules
	public void details() {
		Main.sauterLigne();
		System.out.println("               "+this.marque+" "+this.modele);		
	}
	
	public static void nombreDisponibles() {
		System.out.println("Vous avez "+Véhicules.disponibles.size()+" véhicules disponibles");
	}
	
	
	public void reserver() {
		System.out.println("Vous avez réservé le véhicule "+getMarque()+" "+getModele());
		Véhicules.disponibles.remove(this) ;
		Véhicules.reserve.add(this);
		System.out.println("Merci, votre réservation est prise en compte, à bientot.");
		Main.sauterLigne();
		System.out.println("Retour au menu principal");
		Main.sauterLigne();
	}
	
	public void restituer() {
		System.out.println("Vous avez réstitué le véhicule "+getMarque()+" "+getModele());
		Véhicules.disponibles.add(this) ;
		Véhicules.reserve.remove(this);
		System.out.println("Merci, à bientot");
		Main.sauterLigne();
		System.out.println("Retour au menu principal");
		Main.sauterLigne();
		
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
	public static int getCompteur() {
		return compteur;
	}
	public void setCompteur(int compteur) {
		Véhicules.compteur = compteur;
	}

}
;