package com.mygdx.game.GameLayer;

import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.Collision.ICollision;
import com.mygdx.game.Entity.Entity;
import com.mygdx.game.Entity.TextureObject;
import com.mygdx.game.InputOutput.IOManager;
import com.mygdx.game.InputOutput.iInput;
import com.mygdx.game.PlayerControl.IPlayerControl;
import com.mygdx.game.PlayerControl.PlayerControlManager;

public class Bucket extends TextureObject implements IPlayerControl, ICollision{
	private IOManager iom;
	private Rectangle boundary;
	private Map<String, Integer> keyMap;

	
	
	public Bucket(String t, float x, float y, float speed) {
		super(t, x, y, speed);
		iom = IOManager.getInstance();
		boundary = new Rectangle(getX(), getY(), getTex().getWidth(), getTex().getHeight());
	}


	@Override
	public void PlayerMovement() {
		keyMap = iom.getKeyMap();
		System.out.println(keyMap.get("Left"));
		if (Gdx.input.isKeyPressed(keyMap.get("Left"))) 
		{
			float new_pos =  getX() - 300 * Gdx.graphics.getDeltaTime();
			setX(new_pos);
		}
		if (Gdx.input.isKeyPressed(keyMap.get("Right"))) 
		{
			float new_pos =  getX() + 300 * Gdx.graphics.getDeltaTime();
			setX(new_pos);
		}

	}


	@Override
	public Rectangle getBoundary() {
		return boundary;
	}


	@Override
	public void collide(ICollision collisionEntity) {
		
	}

}
