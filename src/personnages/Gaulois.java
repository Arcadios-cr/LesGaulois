package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void boirePotion(int forcePotion) {
	    this.effetPotion = forcePotion;
	    if (forcePotion == 3) {
	        this.force *= 10;
	        System.out.println("Merci Druide, je sens que ma force est 3 fois décuplée.");
	    }
	}
	public void frapper(Romain romain) {
		int forceFrappe = force / 3;
		if(effetPotion > 0) {
		forceFrappe *= effetPotion;
		}
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(forceFrappe);
		}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		}
	

	public static void main(String[] args) {
//			Gaulois gaulois = new Gaulois("Astérix", 100);
//	        Romain romain = new Romain("Caius Bonus", 50);
//	        
//	        System.out.println(gaulois);
//	        System.out.println(romain);
//	        
//	        gaulois.parler("Bonjour les Romains !");
//	        
//	        gaulois.frapper(romain);
//	        
//	        System.out.println(gaulois);
//	        System.out.println(romain);
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.boirePotion(3);
		System.out.println(asterix); // vérification de la force d'Astérix après avoir bu la potion

	       
		}
}


