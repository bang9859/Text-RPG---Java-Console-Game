package users;

import java.util.Vector;

import textrpg.TextRPGSystem;
import units.Hero;

public class Party {
	private Guild guild = Guild.getInstance();
	private User user = User.getInstance();
	private TextRPGSystem gameSystem = TextRPGSystem.getInstance();
	private static Vector<Hero> parties;

	public void getPartyMember() {
		for (int i = 0; i < user.getUserGuildList().size(); i++) {
			if (user.getUserGuildList().get(i).getPartiesCheck())
				parties.add(user.getUserGuildList().get(i));
		}
	}

	public void partiChange() {
		showParties();
		showGuild();
	}

	private void showGuild() {
		for(int i=0;i<guild.getGuildList().size();i++) {
			String info = String.format("이름: %s 체력: %d, 공격력: %d", guild.getGuildList().get(i).getName(),guild.getGuildList().get(i).getHp(),guild.getGuildList().get(i).getPower());
			gameSystem.printConsole(i+")"+info);
		}
	}

	public void showParties() {
		for (int i = 0; i < parties.size(); i++) {
			String info = String.format("이름: %s 체력: %d, 공격력: %d", parties.get(i).getName(), parties.get(i).getHp(),
					parties.get(i).getPower());
			gameSystem.printConsole(i+")"+info);
		}
	}

}
