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
}