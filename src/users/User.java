package users;

import java.util.Vector;

import textrpg.TextRPGSystem;
import units.Healer;
import units.Hero;
import units.Tanker;
import units.Warrior;
import units.Wizard;

public class User {
	private final int NUMBER = 1;
	private final int STRING = 2;

	private int posX = 1;
	private int money = 100000;

	private Guild guild = Guild.getInstance();
	private TextRPGSystem gameSystem = TextRPGSystem.getInstance();
	private Vector<Hero> userGuildList = guild.getGuildList();
	
	Warrior warrior = new Warrior("전사", 200, 30, 0, 1, false);
	Healer healer = new Healer("힐러", 100, 20, 0, 1, false);
	Tanker tanker = new Tanker("탱커", 400, 20, 0, 1, false);
	Wizard wizard = new Wizard("마법사", 150, 500, 0, 1, false);

	private User() {
	}

	private static User instance = new User();

	public static User getInstance() {
		return instance;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
