package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force, Equipement equipements[], int nbEquipement) {
		this.nom = nom;
		this.force = force;
		this.nbEquipement = nbEquipement;
		this.equipements = equipements;
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
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0 :
		}
	}
	
	public static void main(String[] args) {
//		Romain brutus = new Romain("Brutus", 8);
//		brutus.prendreParole();
//		brutus.parler("bonjour");
//		brutus.recevoirCoup(400);
//      Romain minus = new Romain("Minus",6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
}
