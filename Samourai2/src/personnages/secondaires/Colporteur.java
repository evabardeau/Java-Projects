/**
 * 
 */
package personnages.secondaires;

import personnages.principaux.Commercant;

/**
 * @author bardeaueva
 *
 */
public class Colporteur extends Commercant {
	
	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		int montantPerdu = this.getArgent() / 2;
		this.perdreArgent(montantPerdu);
		this.parler("Eheh je t'ai bien eu.");
		return montantPerdu;
	}

}
