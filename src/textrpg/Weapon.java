package textrpg;

public class Weapon {
	private String name;
	private int plusPower;
	private int plusHp;

	public Weapon(String name, int plusPower, int plusHp) {
		this.name = name;
		this.plusPower = plusPower;
		this.plusHp = plusHp;
	}

	public String getName() {
		return name;
	}

	public int getPlusPower() {
		return plusPower;
	}

	public int getPlusHp() {
		return plusHp;
	}

}
