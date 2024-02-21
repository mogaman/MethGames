package com.mygdx.game.Entity;

import java.util.*;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.*;

public class EntityManager{
	private List<Entity> entityList;
	private static EntityManager instance;
	
	public EntityManager() {
		this.entityList = new ArrayList<>();
		
	}
	
	public void addEntity(Entity e) {
		entityList.add(e);
	}

	public void create() {
		for(Entity i : entityList) {
			i.create();
		}
	}
	
	public static EntityManager getInstance() {
		if(instance == null) {
			instance = new EntityManager();
		}
		return instance;
	}


	public void update() {
		for(Entity i : entityList) {
			i.update();
		}
	}	
	
	public void dispose() {
		for(Entity i : entityList) {
			i.dispose();
		}
	}

	public List<Entity> getList() {
		return entityList;
	}
}
