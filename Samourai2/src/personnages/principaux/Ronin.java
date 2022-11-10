/**
 * 
 */
package personnages.principaux;

import personnages.Humain;

/**
 * @author bardeaueva
 *
 */
public class Ronin extends Humain{
	
	private int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1; 
	}
	
	public void donnerArgent(Commercant commercant, int montant) {
			this.perdreArgent(montant);
			commercant.gagnerArgent(montant);
			this.parler("Voilà pour vous mon brave.");
		
	}
	
	public void provoquerDuelYak(Yakuza yakuza) {
		if (yakuza.getReputation() < (this.honneur * 2)) {
			yakuza.perdreDuel();
			
			int montantGagne = yakuza.getArgent();
			this.gagnerArgent(montantGagne);
			yakuza.perdreArgent(montantGagne);
			this.honneur++;
			this.parler("Je t'ai vaincu  " +yakuza.getNom() + " du  clan " + yakuza.getClan() + " !");
		
		}
		else {
			yakuza.gagnerDuel();
			this.parler("J'y crois pas, j'ai perdu contre un yak...");
			this.honneur--;
			
		}
	}

}
