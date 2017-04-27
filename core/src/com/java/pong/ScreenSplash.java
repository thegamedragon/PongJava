package com.java.pong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class ScreenSplash implements Screen{

    Game game;
    private float time;
    private boolean doOnce;

    public ScreenSplash(Game g) {
        game = g;
        time = 0;
        doOnce = true;
        game.assetManager.load("core/assets/Splash.jpg",Texture.class);
        game.assetManager.load("core/assets/SplashTitle.png",Texture.class);
        game.assetManager.finishLoading();
        game.splash = game.assetManager.get("core/assets/Splash.jpg",Texture.class);
        game.splashTitle = game.assetManager.get("core/assets/SplashTitle.png",Texture.class);
    }

    @Override
    public void show() {
        Gdx.gl20.glClearColor(0,1,0,1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
        time = 0;


    }

    @Override
    public void render(float delta) {
        //System.out.println("splash");
        game.batch.begin();
        game.batch.draw(game.splash,0,0);
        game.batch.draw(game.splashTitle,Gdx.graphics.getWidth()/2 - game.splashTitle.getWidth()/2 , Gdx.graphics.getHeight()/2 - game.splashTitle.getHeight()/2 );
        game.batch.end();
        time+=Gdx.graphics.getDeltaTime();
        if(time>=1.0f){
            game.setScreen(new ScreenMainMenu(game));
        }
        if(doOnce){
            doOnce=false;
            game.assetManager.load("core/assets/Background.jpg",Texture.class);
            game.assetManager.load("core/assets/CircleField.png",Texture.class);
            game.assetManager.load("core/assets/PaddleGreenCurved.png",Texture.class);
            game.assetManager.load("core/assets/PaddleRedCurved.png",Texture.class);
            game.assetManager.finishLoading();
            game.background = game.assetManager.get("core/assets/Background.jpg",Texture.class);
            game.circleField = game.assetManager.get("core/assets/CircleField.png",Texture.class);
            game.paddleGreenCurved = game.assetManager.get("core/assets/PaddleGreenCurved.png",Texture.class);
            game.paddleRedCurved = game.assetManager.get("core/assets/PaddleRedCurved.png",Texture.class);
        }

    }

    @Override
    public void resize(int width, int height) {
        //
    }

    @Override
    public void pause() {
        //
    }

    @Override
    public void resume() {
        //
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        //
    }
}
