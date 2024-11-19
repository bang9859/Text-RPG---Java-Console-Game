package units;

abstract public class Monster extends Unit{

	public Monster(String name, int hp, int power) {
		super(name, hp, power);
	}

	
	abstract public void MonsterSkill();
}
