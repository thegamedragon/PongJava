package com.java.pong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class ScreenMainMenu implements Screen{
    Game game; 


    public ScreenMainMenu(Game g) {
        game=g;

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor(1,0,0,1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Begin

        game.batch.begin();

        //draw BG
        game.batch.draw(game.background,0,0);

        //draw Buttons

        //draw Playing Game to the left
        game.batch.draw(game.circleField,0,0);

        //End
        game.batch.end();
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
        //
    }

    @Override
    public void dispose() {

    }
}
