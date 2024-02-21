package com.mygdx.game.Entity;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;


public abstract class Entity{

	private float x, y;
	private float speed;
	
	public Entity (float x, float y, float speed) {
		this.x =x;
		this.y =y;
		this.speed = speed;
	}
	
	//X Axis Get Set
	public float getX() 
	{
		return x;
	}

	public void setX(float x) 
	{
		this.x = x;
	}

	//Y Axis Get Set
	public float getY() 
	{
		return y; 	
	}

	public void setY(float y) 
	{
		this.y = y;
	}

	//Speed Get Set
	public float getSpeed() 
	{
		return speed;
	}

	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}


	
	public abstract void create();
	
	public abstract void update();
	
	public abstract void dispose();
}

