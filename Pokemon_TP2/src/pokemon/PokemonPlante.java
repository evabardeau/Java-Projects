package pokemon;

public class PokemonPlante extends Pokemon {
	
private static TypePokemon type = TypePokemon.PLANTE;
	
	public PokemonPlante(String nom) {
		super(nom, type);
	}

	@Override
	public void attaquer(Pokemon p) {
		this.subir(p);
		
	}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType()) {
		
			case EAU : 
				this.log("C'est super efficace !");
				if (p.hp < this.getAtk()) {
					p.hp = 0;
					return; 
					
				}
				else{
				p.hp -= this.getAtk() * 2; 
				return; 
				}
				
			case PLANTE, FEU : 
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
