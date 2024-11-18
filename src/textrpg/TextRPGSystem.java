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

		}
	}

	private void setGame() {

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
