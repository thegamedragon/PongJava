package com.java.pong;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;

import java.util.ArrayList;
import java.util.List;


public class ScreenMainMenu implements Screen{
    enum MenuState {MAIN, SETTINGS, PLAY, TOURNAMENT}; // TODO figure out buttons and states
    Game game;
    Button testButton;
    List<Button> buttonList;
    MenuState menuState;

    /*todo mysql for data base
    database:
    user pass score ceva, maybe history, maybe picture
    anything, just to have sth




    */
    public ScreenMainMenu(Game g) {
        game=g;
        menuState= MenuState.MAIN;

        Gdx.input.setInputProcessor(new InputAdapter(){
            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                if(button == Input.Buttons.LEFT){
                    int ID = getButtonID(screenX,screenY);
                    for(Button aux : buttonList){
                        if(aux.ID == ID) aux.clicked =true;
                    }
                }
                return true;
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                for(Button aux : buttonList){
                    if(aux.clicked ==true ) System.out.println(aux.ID); //TODO : DO STH BASED ON ID
                    aux.clicked =false;
                }
                return true;
            }
        });
        //testButton = new Button(1100,300,1,game.testTexture); //TODO remove
        buttonList = new ArrayList<Button>();
        buttonList.add(new Button(1100,300,1,game.testTexture));
        //buttonList.stream().filter(o -> o.ID == 1).forEach( o -> o.clicked =false); //TODO useless & remove but kept for reference
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor(1,0,0,1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //draw BG
        game.batch.begin();
        game.batch.draw(game.background,0,0);
        game.batch.end();

        //draw Buttons
        for(Button aux : buttonList ){
            aux.draw(game.batch);
        }

        //draw Playing Game to the left
        game.batch.begin();
        game.batch.draw(game.circleField,0,0);
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

    public int getButtonID (int x, int y){ // Returns the id of the clicked button
        for(Button aux : buttonList){
            if(x > aux.x &&  x < aux.x+aux.width && y > aux.y && y < aux.y+aux.height) return aux.ID;
        }
        return -1;
    }


}
