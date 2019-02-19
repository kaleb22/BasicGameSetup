package br.edu.ufabc.basicgamesetup.screen;

import com.badlogic.gdx.Screen;

public abstract class MyScreen implements Screen {

	private String id;
	private boolean done; 	// terminou sua fun��o
	
	public MyScreen(String id) {
		this.id = id;
		this.done = false;
	}
	
	// toda tela ter� que implementar esses dois m�todos
	public abstract void update(float delta);	
	public abstract void draw(float delta);
	
	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		update(delta);
		draw(delta);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
