package com.java.pong;

public class GameCircular {
    public boolean isPlaying;

    public GameCircular(){ //Constructor
        isPlaying=false;
    }

    public void start(){ //Runs once
        isPlaying=true;
        reset();
        start();

    }

    public void render(){ // Called every frame

    }

    public void reset(){ //Resets everything to its beginning

    }

}
