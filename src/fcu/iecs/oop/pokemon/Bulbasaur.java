package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon
{
	public Bulbasaur(String nickname,PokemonType type,int cp)
	{
		super (nickname,type,cp);
	}
	
	public void attack()
	{
		System.out.println("Tackle...");
	}

}
