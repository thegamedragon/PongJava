package com.java.pong;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Button {
    public float x,y; //X and Y coords of the button
    private Texture textureDefault;
    private Texture textureOnMouseClick; //maybe
    public int ID;

    public Button(int x, int y, int ID, Texture textureDefault) {
        this.x = x;
        this.y = y;
        this.ID = ID;
        this.textureDefault = textureDefault;
        this.textureOnMouseClick = null;
    }

    public void loadTextureOnMouseClick(Texture texture){
        textureOnMouseClick = texture;
    }

    public void draw(SpriteBatch batch, boolean clicked){
        batch.begin();
        if(!clicked || textureOnMouseClick == null) batch.draw(textureDefault, x, y);
        else batch.draw(textureOnMouseClick, x, y);
        batch.end();
    }
    // TODO hi



}
