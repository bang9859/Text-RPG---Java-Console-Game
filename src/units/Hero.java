package units;

abstract public class Hero extends Unit{
	private int exp;
	private int level;
	
	public Hero(String name, int hp, int power,int exp, int level) {
		super(name, hp, power);
		this.exp =exp;
		this.level = level;
	}
	
	abstract public void HeroSkill();

}
