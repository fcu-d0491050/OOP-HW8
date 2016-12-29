package fcu.iecs.oop.pokemon;

public class Main {
	public static void main(String[] args)
	{
		Pokemon pokemon1 = new Bulbasaur("I am Bulbasaur", PokemonType.GRASS, 123);
	    Pokemon pokemon2 = new Charmander("I am Charmander", PokemonType.FIRE, 456);
	    Pokemon pokemon3 = new Psyduck("I am Psyduck", PokemonType.WATER, 89);
	    
	    GYM gym = new GYM();
	    gym.fight(pokemon1);
	    gym.fight(pokemon2);
	    gym.fight(pokemon3);
	}

}