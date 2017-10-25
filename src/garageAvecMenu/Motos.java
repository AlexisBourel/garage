package garageAvecMenu;

public class Motos extends Véhicules {
	
	private int cylindree;

	public Motos() {
	}

	public Motos(String marque, String modele, int cylindrée) {
		super(marque, modele);
		this.cylindree=cylindrée;
	}
	
	public void details() {
		super.details();
		System.out.println("Type : Moto ");
		System.out.println("Cylindrée : "+this.cylindree +" cc");
		System.out.println("*********************************************");
	}

	public int getCylindrée() {
		return cylindree;
	}

	public void setCylindrée(int cylindrée) {
		this.cylindree = cylindrée;
	}

}
