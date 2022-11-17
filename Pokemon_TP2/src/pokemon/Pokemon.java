/**
 * 
 */
package pokemon;
import java.util.Random;

/**
 * @author bardeaueva
 *
 */
public abstract class Pokemon {
	private String nom;
	protected int hp; 
	private int niveau;
	private int atk;
	static Random rand = new Random();
	private TypePokemon type;
	
	public Pokemon(String nom, TypePokemon type) {
		
		this.nom = nom;
		this.niveau = rand.nextInt(11)+1;
		this.hp = 2 * this.niveau; 
		this.atk = (this.niveau / 2) + 1;
		this.type = type;  
		
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
	
	
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	
	public String toString() {
		return this.nom  + " :\nNIV : " + this.niveau + "\nHP : " + this.hp + "\nATK : " + this.atk +'\n';
		
	}
	
	private String prefixe() {
		return "Pokemon " + this.nom; 
	}
	
	public void log(String message) {
		System.out.println(prefixe() + message);
	}

	/**
	 * @return the type
	 */
	public TypePokemon getType() {
		return type;
	}
	
}
