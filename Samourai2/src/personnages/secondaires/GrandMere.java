/**
 * 
 */
package personnages.secondaires;

import personnages.Humain;
import java.util.Random;


/**
 * @author bardeaueva
 * 
 */
public class GrandMere extends Humain {
	
	private Humain[] memoire = new Humain[30];
	private static Random rand = new Random();
	private int nbHumainsMemoire = 0 ;
	
	public GrandMere(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	
	/**
	 * @param humain
	 */
	public void faireConnaissance(Humain humain) {		//S'il y a de la place dans sa mémoire, la Grand-Mère ajoute la personne qu'elle rencontre à sa mémoire (si elle n'y est pas déjà)
		
		if(nbHumainsMemoire +1 < 30 ) {
			
			for(int i = 0 ; i < nbHumainsMemoire ; i++) {
				
				if(humain == memoire[i] ){ 		//Si elle connait déjà l'humain, elle le salue et ne l'ajoute pas dans sa mémoire
					
					if(humain instanceof Traitre) {
						
						parler("Sale traitre !!  A l'aide !\n");
				
					}else {
				
						parler("Bonjour " + humain.getNom() + ", comment allez-vous ?\n");
					}
				
					return;
				}
			}
		
			memoire[nbHumainsMemoire] = humain; 		// Autrement elle fait sa connaissance et l'ajoute à sa mémoire
			
			nbHumainsMemoire ++ ; 
		}
	
		if( humain instanceof Traitre) {
		
			parler(humain.getNom() + " ? Sale traitre !!  A l'aide !\n");
		
		}else {
		
			parler("Bonjour " + humain.getNom() + ", ravie de faire votre connaissance.\n");
		
		}
	}
	
	
	public String humainHasard() {			//Chiffre généré aléatoirement entre 1 et 4 et renvoie le statut correspondant
		int max = 4; int min = 0; 			// Simule la mémoire de la Grand-Mère
		Random ran = new Random();
		int x = ran.nextInt(max) + min; 
		
		switch(x) {
			case (1) :
				return "Commercant"; 
				
			case (2) :
				return "Yakuza"; 
				
			case (3) : 
				return "Ronin"; 
				
			case (4) : 
				return "Samourai"; 

			case (0) : 
				return "retraité";

			default :
				return "erreur";
		
			}
		

	}
	

	
	
	public void ragoter() {		//Affiche toutes les personnes qu'elle a en mémoire et leur statut aléatoire (à l'aide de la méthode humainHasard, sauf si c'est un traitre qu'elle reconnait
		
		if(nbHumainsMemoire == 0) {
			
			parler("Olala je ne me souviens de rien, ma mémoire me fait défaut...\n");
		
		}else {
		
			parler("Mmmh, oui j'en connais du monde...\n");
		
			for(int i = 0 ; i < this.nbHumainsMemoire ; i++) {
			
				if(memoire[i] instanceof Traitre) {
				System.out.println("Je sais que " + memoire[i].getNom() + " est un traitre !!");
		
				}else {
				
					System.out.println("Je crois que " + memoire[i].getNom() + " est un " + humainHasard() + "...");
									}
		}
	}
	
	}
	
	
/*	
public static void main(String[] args) {
		
		Commercant commercantTest = new Commercant("Kentaro", "thé", 1000);
		Yakuza yakuzaTest = new Yakuza("Miura", "pepsi", 900, "Seinen");
		Samourai samouraiTest = new Samourai("Etorouji", "thé", 10000, "Kito");
		Traitre traitreTest = new Traitre("Shiono", "jus citron", 1900, "Tonkam");
		
		GrandMere gmTest = new GrandMere("Asano", "tisane", 300);
		gmTest.direBonjour();
		gmTest.boire();
		gmTest.faireConnaissance(samouraiTest);
		gmTest.faireConnaissance(traitreTest);
		gmTest.faireConnaissance(yakuzaTest);
		gmTest.faireConnaissance(commercantTest);
		
		gmTest.ragoter();
	}
	
	
	*/
	

}
