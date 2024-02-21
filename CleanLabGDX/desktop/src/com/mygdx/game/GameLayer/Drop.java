package com.mygdx.game.GameLayer;

import com.badlogic.gdx.graphics.Color;
import com.mygdx.game.AIControl.IAIControl;
import com.mygdx.game.Entity.TextureObject;

public class Drop extends TextureObject implements IAIControl{
	

	public Drop(String t, float x, float y, float speed, boolean AI) {
		super(t, x, y, speed, AI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AIMovement() {
		setY(getY() - getSpeed());

		//Reset Y pos
		if (getY() <= 0) 
		{
			setY(400);
			setSpeed(getSpeed()+2);
		}
		//update();
	}

}
