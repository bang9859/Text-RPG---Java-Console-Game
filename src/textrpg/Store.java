package textrpg;

import java.util.ArrayList;

public class Store {
	ArrayList<Weapon> swordlist = new ArrayList<Weapon>();
	private Store() {

	}

	private static Store instance = new Store();

	public Store getInstance() {
		return instance;
	}
}
