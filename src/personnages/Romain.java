package personnages;

public class Romain {
	private String nom;
	private int force;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "la force d'un Romain est positive";
		int forceInit = force;
		force -= forceCoup;
		if (force > 0 ) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceInit : "la force d'un a diminué";
	}
	
	public static void main(String[] args) {
//		Romain brutus = new Romain("Brutus", 8);
//		brutus.prendreParole();
//		brutus.parler("bonjour");
//		brutus.recevoirCoup(400);
//		Romain minus = new Romain("Minus", -6);
	}
}
