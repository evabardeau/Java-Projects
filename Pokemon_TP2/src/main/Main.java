package main;

import pokemon.Pokemon0;

 

public class Main {
	
	
	
	public static void main(String[] args) {
	
		
		Pokemon0 b = new Pokemon0("Bulbizarre");
		Pokemon0 s = new Pokemon0("Salameche");
		Pokemon0 c = new Pokemon0("Carapuce");
		
		
		System.out.println(b.toString());
		System.out.println(s.toString());
		System.out.println(c.toString());
		
		b.attaquer(s);
		System.out.println(s.getHp());
	}

}
