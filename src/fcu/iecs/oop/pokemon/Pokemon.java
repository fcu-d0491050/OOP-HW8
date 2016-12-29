package fcu.iecs.oop.pokemon;

public class Pokemon
{
	private String nickname;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String nickname, PokemonType type, int cp)
	{
		super();
		this.nickname = nickname;
		this.type = type;
		this.cp = cp;
	}
	
	public String getNickname()
	{
		return nickname;
	}
	
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	
	public int getCp()
	{
		return cp;
	}

	public void setCp(int cp)
	{
		this.cp = cp;
	}
	
	public PokemonType getType()
	{
		return type;
	}
	
	public void attack()
	{
		
	}
	
}
