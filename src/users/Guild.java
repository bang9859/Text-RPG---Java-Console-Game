package users;

import units.Healer;
import units.Tanker;
import units.Warrior;
import units.Wizard;

public class Guild {
	Warrior warrior = new Warrior("전사", 200, 30, 0, 1,false);
	Healer healer = new Healer("힐러", 100, 20, 0, 1,false);
	Tanker tanker = new Tanker("탱커", 400, 20, 0, 1,false);
	Wizard wizard = new Wizard("마법사", 150, 500, 0, 1,false);

	private Guild() {

	}

	private static Guild instance = new Guild();

	public static Guild getInstance() {
		return instance;
	}
}
