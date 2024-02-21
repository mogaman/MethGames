package com.mygdx.game.GameLayer;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.AIControl.IAIControl;
import com.mygdx.game.Collision.ICollision;
import com.mygdx.game.Entity.TextureObject;

public class Drop extends TextureObject implements IAIControl, ICollision{
	private Rectangle boundary;
	private Random rand = new Random();
	private Texture tex;

	public Drop(String t, float x, float y, float speed) {
		super(t, x, y, speed);
		tex = getTex();
		boundary = new Rectangle(getX(), getY(), tex.getWidth(), tex.getHeight());
	}

	@Override
	public void AIMovement() {
		setY(getY() - getSpeed());

		//Reset Y pos
		if (getY() <= 0) 
		{
			setY(400);
			setX(rand.nextInt(600));
		}
		//update();
	}

	@Override
	public Rectangle getBoundary() {
		boundary.setPosition(getX(), getY());
		return boundary;
	}

	@Override
	public void collide(ICollision collisionEntity) {
		if(collisionEntity instanceof Bucket) {
			setY(400);
			setX(rand.nextInt(600));
		}
	}

}
