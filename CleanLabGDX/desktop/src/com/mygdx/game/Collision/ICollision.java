package com.mygdx.game.Collision;

import com.badlogic.gdx.math.Rectangle;

public interface ICollision {
	public Rectangle getBoundary();
	public void collide(ICollision collisionEntity);
}
