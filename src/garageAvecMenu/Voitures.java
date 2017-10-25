package garageAvecMenu;

public class Voitures extends Véhicules {
		
	private int places;
	private String motorisation;
	
	public Voitures() {
		super();
	}

	public Voitures(String marque, String modele,int places, String motorisation) {
		super(marque, modele);		
		this.places = places;	
		this.motorisation = motorisation;
	}
	
	public void details() {
		super.details();
		System.out.println("Type : Voiture ");
		System.out.println("Motorisation : "+this.motorisation);
		System.out.println("Nombre de places : "+this.places);
		System.out.println("*********************************************");
		
	}
	
	public String getMotorisation() {
		return motorisation;
	}

	public void setMotorisation(String motorisation) {
		this.motorisation = motorisation;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

}
