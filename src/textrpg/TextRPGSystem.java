package textrpg;

public class TextRPGSystem {
	private TextRPGSystem() {

	}

	private static TextRPGSystem instance = new TextRPGSystem();

	public TextRPGSystem getInstance() {
		return instance;
	}
}
