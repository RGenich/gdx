package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.model.FlyingCircle;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	FlyingCircle fc = new FlyingCircle(1, 1, 1f, 2f);

	
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
		fc.getTexture().dispose();
	}
}
