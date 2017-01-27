package gogol;

import gameframework.core.GameLevel;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		GogolDefaultImpl g = new GogolDefaultImpl();
		ArrayList<GameLevel> levels = new ArrayList<>();

		levels.add(new GameLevelOne(g)); // only one level is available
		
		g.setLevels(levels);
		g.start();
	}
}
