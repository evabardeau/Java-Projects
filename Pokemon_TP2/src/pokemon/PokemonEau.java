/**
 * 
 */
package pokemon;

/**
 * @author bardeaueva
 *
 */
public class PokemonEau extends Pokemon {
	
private static TypePokemon type = TypePokemon.EAU;
	
	public PokemonEau(String nom) {
		super(nom, type);
	}

	@Override
	public void attaquer(Pokemon p) {
		this.subir(p);
		
	}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType()) {
		
			case FEU : 
				this.log("C'est super efficace !");
				if (p.hp < this.getAtk()) {
					p.hp = 0;
					return; 
					
				}
				else{
				p.hp -= this.getAtk() * 2; 
				return; 
				}
				
			case PLANTE, EAU : 
				this.log("C'est pas très efficace...");
				if (p.hp < this.getAtk()) {
					p.hp = 0;
					return; 
					
				}
				else{
					p.hp -= (0.5 * this.getAtk());	
					return; 
				}
				
			default : 
				if (p.hp < this.getAtk()) {
					p.hp = 0;
					return; 
					
				}
				else{
					p.hp -= (this.getAtk());	
					return; 
				}
		}
	}


}
