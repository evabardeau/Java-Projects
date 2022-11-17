/**
 * 
 */
package pokemon;
import java.util.Random;

/**
 * @author bardeaueva
 *
 */
public class Pokemon0 {
	private String nom;
	private int hp; 
	private int niveau;
	private int atk;
	static Random rand = new Random();
	private String type;
	
	public Pokemon0(String nom) {
		
		this.nom = nom;
		this.niveau = rand.nextInt(11)+1;
		this.hp = 2 * this.niveau; 
		this.atk = (this.niveau / 2) + 1;
		
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}


	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}


	public boolean isKO() {
		return this.hp == 0;
	}
	
	public void soigner() {
		this.hp = 2 * this.niveau;
	}
	
	
	
	public void attaquer(Pokemon0 p) {
		System.out.println(this.getNom() + ", à l'attaque !");
		System.out.println("-" + this.getAtk());
		
		if (p.hp < this.atk) {
			p.hp = 0;
			
		}
		else{
			p.hp -= this.atk;
		}
		
	}
	
	
	
	public String toString() {
		return this.nom  + " :\nNIV : " + this.niveau + "\nHP : " + this.hp + "\nATK : " + this.atk +"\nTYPE : " + this.type + '\n';
		
	}
	
	private String prefixe() {
		return "Pokemon " + this.nom; 
	}
	
	public void log(String message) {
		System.out.println(prefixe() + message);
	}
}
