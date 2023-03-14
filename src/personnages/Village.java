package personnages;

public class Village {
	private String nom;
	private Chef chef;
	
	public Village(String nom, Chef chef) {
		super();
		this.nom = nom;
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
