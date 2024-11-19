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
	
	private final int WARRIOR = 1;
	private final int HEALER = 2;
	private final int TANKER = 3;
	private final int WIZARD = 4;
	

	private int posX = 1;
	private int money = 100000;

	private static Guild guild = Guild.getInstance();
	private TextRPGSystem gameSystem = TextRPGSystem.getInstance();
	private static Vector<Hero> userGuildList = guild.getGuildList();
	
	private User() {
	}

	private static User instance = new User();

	public static User getInstance() {
		return instance;
	}

	public Vector<Hero> getUserGuildList(){
		return userGuildList;
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
	
	public void plusGuild() {
		gameSystem.printConsole("직업선택");
		gameSystem.printConsole("1) 전사");
		gameSystem.printConsole("2) 힐러");
		gameSystem.printConsole("3) 탱커");
		gameSystem.printConsole("4) 마법사");
		int sel = (int) gameSystem.input("입력", NUMBER);
		String name = (String) gameSystem.input("이름: ", STRING);
		if (sel == WARRIOR) {
			userGuildList.add(new Warrior(name, 200, 30, 0, 1, false));
		} else if (sel == HEALER) {
			userGuildList.add(new Healer(name, 200, 30, 0, 1, false));
		} else if (sel == TANKER) {
			userGuildList.add(new Tanker(name, 200, 30, 0, 1, false));
		} else if (sel == WIZARD) {
			userGuildList.add(new Wizard(name, 200, 30, 0, 1, false));
		} else {
			System.err.println("잘못된 입력값입니다.");
		}
	}
}
