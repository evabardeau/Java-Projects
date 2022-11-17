/**
 * 
 */
package pokemon;
import java.util.Random;

/**
 * @author bardeaueva
 *
 */
public class Pokemon {
	private String nom;
	private int hp; 
	private int niveau;
	private int atk;
	static Random rand = new Random();
	
	public Pokemon(String nom, int hp, int atk) {
		
		this.nom = nom;
		this.hp = hp; 
		this.niveau = rand.nextInt(11)+1;
		this.atk = atk;
	}
	
	public boolean isKO() {
		return this.hp == 0;
	}
	
	public void soigner() {
		this.hp = 2 * this.niveau;
	}
	
	public void attaquer(Pokemon p) {
		
		p.hp -= this.atk;
	}
	
	public String toString() {
		return this.nom + this.nom + " !" + "/nNIV : " + this.niveau + "/HP : " + this.hp + "\nATK : " + this.atk;
		
	}
	
	private String prefixe() {
		return "Pokemon " + this.nom; 
	}
	
	public void log(String message) {
		System.out.println(prefixe() + message);
	}
}
