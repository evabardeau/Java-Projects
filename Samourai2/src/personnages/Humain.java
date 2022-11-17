/**
 * 
 */
package personnages;

/**
 * @author bardeaueva
 *
 */
public class Humain {
	
	private String nom;
	private String boisson;
	private int argent;
	

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent; 
	}
	
	public void parler(String texte) {
		System.out.println( "(" + this.nom + ") - " + texte);
		
	}
	
	public void direBonjour() {
		String texte = "Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson;
		parler(texte);
	}

	public void boire() {
		String texte = "Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !";
		parler(texte);
	}
	
	public void gagnerArgent(int montant) {
		this.argent += montant; 
	}
	
	public int perdreArgent(int montant) {
		
		int montantDonne = 0;
		
		if (montant > this.argent) {
			montantDonne = argent;
			this.argent = 0;
			
		}
		
		else {
			this.argent -= montant; 
		}
		
		return montantDonne; 
	}
	
	/**
	 * @return the argent
	 */
	public int getArgent() {
		return argent;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	
}
