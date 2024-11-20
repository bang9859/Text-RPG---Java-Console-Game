package users;

import java.util.Vector;

import textrpg.TextRPGSystem;
import units.Healer;
import units.Hero;
import units.Tanker;
import units.Warrior;
import units.Wizard;

public class Guild {
	
	private TextRPGSystem gameSystem = TextRPGSystem.getInstance();
	private static Vector<Hero> guildList = new Vector<Hero>();
	private Warrior warrior = new Warrior("전사", 200, 30, 0, 1, true);
	private Healer healer = new Healer("힐러", 100, 20, 0, 1, true);
	private Tanker tanker = new Tanker("탱커", 400, 20, 0, 1, true);
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
	
	
	
	
}
