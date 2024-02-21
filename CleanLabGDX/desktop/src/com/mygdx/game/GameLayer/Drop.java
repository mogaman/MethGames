package com.mygdx.game.GameLayer;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.AIControl.IAIControl;
import com.mygdx.game.Collision.ICollision;
import com.mygdx.game.Entity.TextureObject;

public class Drop extends TextureObject implements IAIControl, ICollision{
	private Rectangle boundary;
	private Random rand = new Random();

	public Drop(String t, float x, float y, float speed) {
		super(t, x, y, speed);
		boundary = new Rectangle(getX(), getY(), getTex().getWidth(), getTex().getHeight());
	}

	@Override
	public void AIMovement() {
		setY(getY() - getSpeed());

		//Reset Y pos
		if (getY() <= 0) 
		{
			setY(400);
			setX(rand.nextInt(600));
			setSpeed(getSpeed()+2);
		}
		//update();
	}

	@Override
	public Rectangle getBoundary() {
		return boundary;
	}

	@Override
	public void collide(ICollision collisionEntity) {
		if(collisionEntity instanceof Bucket) {
			setY(400);
			setX(rand.nextInt(600));
			System.out.println("Collided\n\n\n\n\n\n");
		}
		else {
			System.out.println("Collision with Drop");
		}
	}

}
