package com.mygdx.game.PlayerControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.mygdx.game.Entity.Entity;
import com.mygdx.game.Entity.EntityManager;
import com.mygdx.game.InputOutput.IOManager;

public class PlayerControlManager {
	private EntityManager em;
	private IOManager iom;
	private static PlayerControlManager instance;
	private List<IPlayerControl> pcList;
	
	public PlayerControlManager() {
		pcList = new ArrayList<>();
		
		em = EntityManager.getInstance();
		iom = IOManager.getInstance();
		
//		List<Entity> el = em.getList();
//		Map<String, Integer> keyMap = iom.getKeyMap();
		
//		for(Entity e: el) {
//			if(e.getAIControlled() == false) {
//				if (Gdx.input.isKeyPressed(keyMap.get("Left"))) 
//				{
//					float new_pos =  e.getX() - 300 * Gdx.graphics.getDeltaTime();
//					e.setX(new_pos);
//				}
//				if (Gdx.input.isKeyPressed(keyMap.get("Right"))) 
//				{
//					float new_pos =  e.getX() + 300 * Gdx.graphics.getDeltaTime();
//					e.setX(new_pos);
//				}
//			}
//		}
	} 
	
	public void addPlayerControl(IPlayerControl p) {
		pcList.add(p);
	}
	
	public List<IPlayerControl> getList(){
		return pcList;
	}
	
	public void movement() {
		for(IPlayerControl i : pcList) {
			i.PlayerMovement();
		}
	}
	
	public static PlayerControlManager getInstance() {
		if(instance == null) {
			instance = new PlayerControlManager();
		}
		return instance;
	}

}
