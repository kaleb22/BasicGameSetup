package br.edu.ufabc.basicgamesetup;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import br.edu.ufabc.basicgamesetup.screen.GameScreen;
import br.edu.ufabc.basicgamesetup.screen.MyScreen;
import br.edu.ufabc.basicgamesetup.screen.StartScreen;

public class MyGame extends Game {

	private MyScreen myScreen;
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		myScreen = new StartScreen("START");
		setScreen(myScreen);
	}
	
	public void render() {
		myScreen.render(Gdx.graphics.getDeltaTime());
		if(myScreen.isDone()) {
			// aqui eu cuido das transições das telas
			
			if(myScreen.getId().equals("START")) {
				myScreen = new GameScreen("GAME");
			} else {
				myScreen = new StartScreen("START");
			}
		}
	}
}
