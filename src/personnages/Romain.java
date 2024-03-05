package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[];
	private int nbEquipement = 0;
	
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
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien équipé !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement.toString() + " ! ");
			} else {
				System.out.println("Le soldat s'équipe avec un " + nom + " ");
				equipements[1] = equipement;
			}
			break;
		default : // 0
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.toString() + " !");
			nbEquipement = 1;
			equipements[0] = equipement; 
		}
	}
	
	public static void main(String[] args) {
//		Romain brutus = new Romain("Brutus", 8);
//		brutus.prendreParole();
//		brutus.parler("bonjour");
//		brutus.recevoirCoup(400);
        Romain minus = new Romain("Minus",6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
