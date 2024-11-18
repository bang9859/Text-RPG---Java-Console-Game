package textrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class TextRPGSystem {

	private final int STRING = 1;
	private final int NUMBER = 2;

	private final int DENGEON = 1;
	private final int SETTING = 2;
	private final int EXIT = 0;

	private boolean isRun = true;

	private StringBuffer buffer = new StringBuffer();
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	private TextRPGSystem() {

	}

	private static TextRPGSystem instance = new TextRPGSystem();

	public static TextRPGSystem getInstance() {
		return instance;
	}

	public void run() {
		setGame();
		while (isRun) {
			lobby();
		}
	}

	private void lobby() {
		showLobbyMenu();
		int sel = (int) input("입력", NUMBER) - 1;
		if (sel == DENGEON) {
			dengeon();
		} else if (sel == SETTING) {
			setting();
		} else if (sel == EXIT) {
			isRun = false;
		}
	}

	private void setting() {
		// TODO Auto-generated method stub

	}

	private void dengeon() {
		// TODO Auto-generated method stub

	}

	private void showLobbyMenu() {
		printConsole("===[LOBBY]===");
		printConsole("[1.던전] [2.설정] [3.종료]");
	}

	private void setGame() {
		printConsole("===[더조은 RPG]===");
		printConsole("게임을 시작하시려면 엔터를 눌러주세요.");
		while (true) {
			String input = (String) input("입력", STRING);
			if (input.equals("")) {
				break;
			}
		}
		loading("게임 접속중...", 1000);
	}

	private void loading(String msg, int sleepNum) {
		printConsole(msg);
		try {
			Thread.sleep(sleepNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Object input(String msg, int number) {
		printConsole(msg + " : ");
		String input = "";
		try {
			input = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (number == STRING)
			return input;
		else {
			int pick = -1;
			try {
				pick = Integer.parseInt(input);
			} catch (Exception e) {
				System.err.println("숫자만 입력가능합니다.");
			}
			return pick;
		}

	}

	private void printConsole(String msg) {
		buffer.setLength(0);
		buffer.append(msg + "\n");
		try {
			writer.append(buffer);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
