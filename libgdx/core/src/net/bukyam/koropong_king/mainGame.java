package net.bukyam.koropong_king;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class mainGame extends ApplicationAdapter {
	SpriteBatch batch;
	BitmapFont font;
	Texture img;
	int x,y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		img = new Texture("image.axd.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		font.setColor(42,13,23,69);
		font.draw(batch, "Hello World!", 400, 400);
		batch.end();
		x = 0;
		y = 0;
	}
	
	public void update() {
		font.draw(batch, "Hello World!", x, y);
		x++;
		y++;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		img.dispose();
	}
	
}
