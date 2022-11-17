/**
 * 
 */
package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.*;
import personnages.secondaires.*;

import java.util.Random;

/**
 * @author bardeaueva
 *
 */
public class Traitre extends Samourai {
	
	private int traitrise;
	

	public Traitre(String nom, String boisson, int argent, String seigneur) {
		
		super(nom, boisson, argent, seigneur);
		this.traitrise = 0;
		
	}
	
	/**
	 * @return the traitrise
	 */
	public int getTraitrise() {
		
		return traitrise;
	}
	
	public void extorquer(Commercant commercant) {
		
		if (this.traitrise < 3) {
			
			int montantExtorque = commercant.getArgent();
			this.gagnerArgent(montantExtorque);
			commercant.seFaireExtorquer();	
			this.traitrise++;
			this.parler("Ah ah je l'ai bien eu ce commerçant.");
		}
		
		this.parler("Je devrais me faire plus discret pour le moment.");
		
	}
	
	@Override
	public void direBonjour() {
		
		String texte = "Bonjour, je suis " + this.getNom() + ", mon seigneur est " + this.getSeigneur() + " (niveau de traitrise " + this.getTraitrise() + ")";
 		parler(texte);
 		
	}
	
	public void faireLeGentil(Humain personne) {
		
		Random rand = new Random();
		int max = 30;
		int min = 1;
		int montant = rand.nextInt(max - min + 1) + min;
		
		personne.gagnerArgent(this.perdreArgent(montant));
		
		this.parler("Faisons ami-ami, voici " + montant + " yen pour toi.");
		
		int diminution = ((1/10) * montant);
		
		if(traitrise > 0 && diminution < traitrise) {
			this.traitrise -= diminution;
		}
		
	}

}
