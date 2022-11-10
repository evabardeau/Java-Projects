/**
 * 
 */
package personnages.principaux;

import personnages.Humain;

/**
 * @author bardeaueva
 *
 */
public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		
		
	}
	
	public int seFaireExtorquer() {
		int montantPerdu = this.getArgent();
		this.perdreArgent(montantPerdu);
		this.parler("Le monde est vraiment trop injuste...");
		return montantPerdu;
	}
	
	public void recevoir(Ronin ronin, int argent) {
		this.gagnerArgent(argent);
		this.parler("Merci infiniment " + ronin.getNom());
	}

}
