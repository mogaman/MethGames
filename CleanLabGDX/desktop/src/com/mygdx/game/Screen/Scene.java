package com.mygdx.game.Screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public abstract class Scene implements Screen{
	Game game;
	
	public Scene(Game game) {
		this.game = game;
	}
	
	public Game getGame() {
		return game;
	}
}
