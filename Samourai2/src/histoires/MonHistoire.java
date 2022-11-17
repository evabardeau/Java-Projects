/**
 * 
 */
package histoires;

import personnages.Humain;
import personnages.principaux.*;
import personnages.secondaires.Ninja;

/**
 * @author bardeaueva
 *
 */
public class MonHistoire {
	
	public static void main(String[] args) {
		/*
		Ronin musaichi = new Samourai("Akimoto" , "thé" , 20, "Miyamoto");
		musaichi.direBonjour();
		musaichi.boire("sake");
		*/
		Humain humain = new Humain("Prof", "eau", 10);
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		Yakuza yakusa = new Yakuza("Yaku le noir","biere", 42, "WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		Ronin ronin = new Ronin("Roro","sake",61);
		ronin.donnerArgent(commercant, 10);
		ronin.provoquerDuelYak(yakusa);
		ronin.direBonjour();

		Samourai musaichi = new Samourai("Akimoto" , "thé" , 20, "Miyamoto");
		musaichi.direBonjour();
		musaichi.boire("sake");
		
		
		Ninja ninja = new Ninja("Makoto", "thé Oolong", 1000, "Thiefs");
		ninja.direBonjour();
		
	}

}
