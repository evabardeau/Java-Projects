/**
 * 
 */
package personnages.principaux;

import personnages.Humain;

/**
 * @author bardeaueva
 *
 */
public class Yakuza extends Humain {
	private String clan; 
	private int reputation; 
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant commercant) {
		int montantExtorque = commercant.getArgent();
		commercant.perdreArgent(montantExtorque);
		this.gagnerArgent(montantExtorque);
		this.reputation++;
		this.parler("Hehe, je l'ai bien plumé ce commerçant.");
	}
	
	public void gagnerDuel() {
		this.reputation++;
		this.parler("Ahahah, tu parles d'un ronin !");
		
	}
	
	public int perdreDuel() {
		int montantPerdu = this.getArgent();
		this.perdreArgent(montantPerdu);
		this.reputation--;
		this.parler("J'ai perdu mais je reviendrai me venger ! En plus il a pris tout mon fric...");
		return montantPerdu;
	}

	/**
	 * @return the clan
	 */
	public String getClan() {
		return clan;
	}

	/**
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		String texte = "Bonjour, je m'appelle " + this.getNom() + " et j'appartiens au clan " + this.clan + ".";
		parler(texte);
	}

	
	
	
	

}
