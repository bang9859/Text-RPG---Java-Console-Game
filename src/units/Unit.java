package units;

public class Unit {
	private String name;
	private int hp;
	private int power;

	public Unit(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}



