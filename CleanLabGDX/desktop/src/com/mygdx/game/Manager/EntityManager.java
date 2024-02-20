package com.mygdx.game.Manager;

import java.util.*;
import com.mygdx.game.*;

public class EntityManager{
	private List<Entity> entityList;
	
	public void addEntity(Entity e) {
		entityList.add(e);
	}
	
	public EntityManager() {
		this.entityList = new ArrayList<>();
	}

	public void create() {
		for(Entity i : entityList) {
			i.create();
		}
	}
	
	public void draw() {
		for(Entity i : entityList) {
			i.draw();
		}
	}

	public void movement() {
		for(Entity i : entityList) {
			i.movement();
		}
		
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
}
