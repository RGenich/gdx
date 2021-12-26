package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.model.FlyingCircle;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	FlyingCircle fc = new FlyingCircle(new Vector2(150,100), new Vector2(0, -2));
	
	@Override
	public void create () {
		batch = new SpriteBatch();

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		fc.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
