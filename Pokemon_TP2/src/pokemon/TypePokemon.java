package pokemon;

public enum TypePokemon {
	
		FEU("Feu"), 
		EAU("Eau"), 
		PLANTE("Plante");
		private String type;
		
		private TypePokemon(String type) {
			this.type = type;
		
		}
		public String toString(){
			
			return this.type;
		}
		
	

}
