package units;

abstract public class Hero extends Unit{
	private int exp;
	private int level;
	private boolean partiesCheck;
	
	public Hero(String name, int hp, int power,int exp, int level,boolean partiesCheck) {
		super(name, hp, power);
		this.exp =exp;
		this.level = level;
		this.partiesCheck = partiesCheck;
	}
	public boolean getPartiesCheck() {
		return partiesCheck;
	}
	public void setPartiesCheck(boolean partiesCheck) {
		this.partiesCheck=partiesCheck;
	}
	abstract public void HeroSkill();
	
}
