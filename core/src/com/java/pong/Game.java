package com.java.pong;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game extends com.badlogic.gdx.Game{
	public SpriteBatch batch;

	public int p1Score;
	public int p2Score;
	public AssetManager assetManager;
	public Texture ballRed;
	public Texture ballGreen;

	public Texture splashTitle;
	public Texture splash;

	public Texture background;
	public Texture circleField;
	public Texture paddleGreenCurved;
	public Texture paddleRedCurved;
	public Texture paddleGreenRectangle;
	public Texture paddleRedRectangle;


	public Texture testTexture;

	@Override
	public void create () {
		batch = new SpriteBatch();
		assetManager = new AssetManager();
		this.setScreen(new ScreenSplash(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
