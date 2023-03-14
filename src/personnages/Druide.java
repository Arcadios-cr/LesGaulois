package personnages;

import java.util.Random;

public class Druide {
		private String nom;
		private int effetPotionMin;
		private int effetPotionMax;
		private int forcePotion = 1;
		public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
		}
		public String getNom() {
		return nom;
		}
		public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
		private String prendreParole() {
		return "Le druide " + nom + " : ";
			}
		public int preparerPotion() {
		    Random rand = new Random();
		    int forcePotion = rand.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;
		    parler("Je viens de préparer une potion de force ");
		    if (forcePotion > 7) {
		        System.out.println("super potion de force (" + forcePotion + ")");
		    } else if (forcePotion >= 5 && forcePotion <= 7) {
		        System.out.println("de force normale (" + forcePotion + ")");
		    } else {
		        System.out.println("de faible force (" + forcePotion + ")");
		    }
		    return forcePotion;
		}
		public void booster(Gaulois gaulois) {
			if (gaulois.getNom().equals("Obélix")) {
				System.out.println("Non, Obélix !... Tu n'auras pas de potion magique !");
			} else {
				int forcePotion = preparerPotion();
				gaulois.boirePotion(forcePotion);
			}
		}
		public static void main(String[] args) {
		    Druide panoramix = new Druide("Panoramix", 5, 10);
		    int forcePotion = panoramix.preparerPotion();
		    System.out.println("Force de la potion préparée : " + forcePotion);
		}

}
