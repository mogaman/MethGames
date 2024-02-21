package com.mygdx.game.AIControl;

import java.util.ArrayList;
import java.util.List;

import com.mygdx.game.Entity.EntityManager;
import com.mygdx.game.PlayerControl.PlayerControlManager;

public class AIControlManager {
	private EntityManager em;
	private static AIControlManager instance;
	private List<IAIControl> aiList;
	
	public AIControlManager() {
		aiList = new ArrayList<>();
		
		em = EntityManager.getInstance();
	}
	
	public void addAIControl(IAIControl a) {
		aiList.add(a);
	}
	
	public List<IAIControl> getList(){
		return aiList;
	}
	
	public void movement() {
		for(IAIControl a : aiList) {
			a.AIMovement();
		}
	}
	
	public static AIControlManager getInstance() {
		if(instance == null) {
			instance = new AIControlManager();
		}
		return instance;
	}

}
