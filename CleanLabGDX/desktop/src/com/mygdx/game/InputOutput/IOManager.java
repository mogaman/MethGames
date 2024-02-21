package com.mygdx.game.InputOutput;

import java.util.List;
import java.util.Map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Entity.*;


public class IOManager {
	private static IOManager instance;
	private SpriteBatch batch;
	private EntityManager em;
	private ControlsInput input;
	
	public IOManager() {
		em = EntityManager.getInstance();
		batch = new SpriteBatch();
		input = new ControlsInput();
	}
	
	public void outputTexture() {
		List<Entity> el = em.getList();
		batch.begin();
		for(Entity e : el) {
			if(e instanceof TextureObject) {
				Texture tex = ((TextureObject)e).getTex();
				batch.draw(tex, e.getX(), e.getY(), tex.getWidth(), tex.getHeight());
			}			
		}
		batch.end();
	}
	
	public Map<String, Integer> getKeyMap(){
		return input.getKeys();
	}
	
	
	
	public static IOManager getInstance() {
		if(instance == null) {
			instance = new IOManager();
		}
		return instance;
	}
	
	
	public void dispose() {
		
	}

}
