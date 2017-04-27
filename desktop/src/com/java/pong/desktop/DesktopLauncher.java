package com.java.pong.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.java.pong.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=1280;
		config.height=720;
		config.title="Pong";
		config.foregroundFPS=60;
		config.backgroundFPS=60;
		new LwjglApplication(new Game(), config);
	}
}
