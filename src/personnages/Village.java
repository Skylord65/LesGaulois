package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois Villageois[];
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.Villageois = new Gaulois [nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		Villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
		
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		return Villageois[numeroVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef + " vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois; i++ ) {
			System.out.println("- " + Villageois[i].getNom());
		}
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// Les numéros sont de 0 à 29 donc 30 n'est pas dans le tableau
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//null
		//
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}