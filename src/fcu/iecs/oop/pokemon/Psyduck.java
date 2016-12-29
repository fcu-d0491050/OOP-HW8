package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon
{
	public Psyduck(String nickname, PokemonType type, int cp)
	{
		super(nickname, type, cp);
	}
	
	public void attack()
	{
		System.out.println("Aqua Tail...");
	}
}
