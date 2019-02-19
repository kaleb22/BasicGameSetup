package br.edu.ufabc.basicgamesetup.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends MyScreen {
	
	private Texture texture;
	private SpriteBatch spriteBatch;

	public GameScreen(String id) {
		super(id);
		texture = new Texture("game.jpg");
		spriteBatch = new SpriteBatch();
	}


	@Override
	public void dispose() {
		texture.dispose();
		spriteBatch.dispose();
	}

	@Override
	public void update(float delta) {
		
		if (Gdx.input.justTouched())
			setDone(true);
	}

	@Override
	public void draw(float delta) {
		// define que vamos usar bits de cores para limpar a tela
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// define que vou usar a cor preta
		Gdx.gl20.glClearColor(0, 0, 0, 0);
		
		spriteBatch.begin();
		spriteBatch.draw(texture, 0,0);
		spriteBatch.end();
	}

}
