/**
 * 
 */
package personnages.secondaires;

import personnages.principaux.Yakuza;
import java.util.Random;
/**
 * @author bardeaueva
 *
 */
public class Ninja extends Yakuza{
	
	private Random rand = new Random();
	private final static String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private final static int max = 4; 
	private final static int min = 0; 
	
	public Ninja (String nom, String boisson, int argent, String clan) {
	
		super(nom, boisson, argent, clan);	
		int i = rand.nextInt(max) + min;
		this.setClan(this.getClan() + ' ' + clansNinja[i]);
		
	}
	

	public void annoncerClan() {
		
		this.parler("J'appartiens au clan " + this.getClan() + ".");
		
	}
	
	

	
		
	
	
	
}
