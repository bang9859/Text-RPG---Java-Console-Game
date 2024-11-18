package users;

import java.util.Vector;

import textrpg.TextRPGSystem;
import units.Healer;
import units.Hero;
import units.Tanker;
import units.Warrior;
import units.Wizard;

public class Guild {
	private final int NUMBER = 1;
	private final int STRING = 2;

	private final int WARRIOR = 1;
	private final int HEALER = 2;
	private final int TANKER = 3;
	private final int WIZARD = 4;
	
	private TextRPGSystem gameSystem = TextRPGSystem.getInstance();
	private static Vector<Hero> guildList = new Vector<Hero>();
	private Warrior warrior = new Warrior("전사", 200, 30, 0, 1, false);
	private Healer healer = new Healer("힐러", 100, 20, 0, 1, false);
	private Tanker tanker = new Tanker("탱커", 400, 20, 0, 1, false);
	private Wizard wizard = new Wizard("마법사", 150, 500, 0, 1, false);
	
	private Guild() {

	}

	private static Guild instance = new Guild();

	public static Guild getInstance() {
		return instance;
	}
	
	public void setGuild() {
		guildList.add(healer);
		guildList.add(tanker);
		guildList.add(warrior);
		guildList.add(wizard);
		gameSystem.printConsole("기본 캐릭터 생성완료!");
	}
	
	public Vector<Hero> getGuildList() {
		return guildList;
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
			guildList.add(new Warrior(name, 200, 30, 0, 1, false));
		} else if (sel == HEALER) {
			guildList.add(new Healer(name, 200, 30, 0, 1, false));
		} else if (sel == TANKER) {
			guildList.add(new Tanker(name, 200, 30, 0, 1, false));
		} else if (sel == WIZARD) {
			guildList.add(new Wizard(name, 200, 30, 0, 1, false));
		} else {
			System.err.println("잘못된 입력값입니다.");
		}
	}
	
	
}
