package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Shape;
import com.mygdx.game.Entity.*;
import com.mygdx.game.InputOutput.IOManager;
import com.mygdx.game.Screen.*;
import com.mygdx.game.Screen.TitleScene;

//import com.mygdx.game.Manager.*;
import java.util.Random;

public class GameMaster extends Game {
	

	//Iniitalize Manager
	EntityManager entityManager;
	IOManager ioManager;
	SceneManager sceneManager;
	GameInit init;
	
	public void create(){
		
//		entityManager = EntityManager.getInstance();
//		ioManager = IOManager.getInstance();
//		sceneManager = SceneManager.getInstance();
		
		
		init = GameInit.getInstance();
		init.initEM();
		init.initScene(this);
		
//		sceneManager.loadScene(this, "Title");
	}

	
	
	public void render() {
		super.render();		
	}
	
	
	
	public void dispose() {
		
		entityManager.dispose();
		
	}

}
