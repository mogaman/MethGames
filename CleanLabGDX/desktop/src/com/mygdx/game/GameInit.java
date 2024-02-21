package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.Game;
import com.mygdx.game.AIControl.*;
import com.mygdx.game.Entity.*;
import com.mygdx.game.GameLayer.*;
import com.mygdx.game.InputOutput.*;
import com.mygdx.game.PlayerControl.*;
import com.mygdx.game.Screen.*;

public class GameInit {
	private EntityManager em;
	private IOManager iom;
	private SceneManager sm;
	private PlayerControlManager pcm;
	private AIControlManager acm;
	private static GameInit instance;
	
	public GameInit() {
		em = EntityManager.getInstance();
		iom = IOManager.getInstance();
		sm = SceneManager.getInstance();
		pcm = PlayerControlManager.getInstance();
		acm = AIControlManager.getInstance();
	}
	
	public void initEM() {
		int NUM_DROPS = 5;
		Entity bucket = new Bucket("bucket.png", 300,0,20, false);	
		Entity[] drops = new Entity [NUM_DROPS];
		//Create Random Drops
		Random rand = new Random();
 		for (int i = 0 ; i < NUM_DROPS; i++) {
 			int xPos = rand.nextInt(600);
 			int speed = rand.nextInt(9);
			drops[i] = new Drop("droplet.png", xPos, 0, speed, true);
			em.addEntity(drops[i]); //Add droplet entities into entityManager List
			acm.addAIControl((IAIControl)drops[i]);
		}
 		
 		//Add Bucket to Entity Manager
		em.addEntity(bucket);
		pcm.addPlayerControl((IPlayerControl)bucket);
	}
	
	
	public void initScene(Game game) {
		sm.addScene(new TitleScene(game), "Title");
		sm.addScene(new GameScene(game), "Game");
		
		sm.loadScene(game, "Title");
	}
	
	
	public static GameInit getInstance() {
		if(instance == null) {
			instance = new GameInit();
		}
		return instance;
	}

}
