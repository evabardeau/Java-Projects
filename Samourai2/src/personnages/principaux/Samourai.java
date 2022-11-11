/**
 * 
 */
package personnages.principaux;

/**
 * @author bardeaueva
 *
 */
public class Samourai extends Ronin {
	
	private String seigneur; 
	
	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent);
		this.seigneur = seigneur; 
		
	}
	
	/**
	 * @return the seigneur
	 */
	public String getSeigneur() {
		return seigneur;
	}


	@Override
	public void direBonjour() {
		String texte = "Je suis le samouraï " + this.getNom() + ", et je sers le seigneur " + this.seigneur + ".";
		this.parler(texte);
		
	}
	
	public void boire(String boisson) {
		this.parler("Mmmh un bon verre de " + boisson + ".");
	}

}
